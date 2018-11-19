<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户管理</title>

<link
	href="bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<style>
.input1 {
	width: 80px;
}
.input{
width:80px;
 }
 .liover{
background-color: green;
}
select {
   margin-top:10px;
	width: 80px;
}
</style>

</head>

<body>
<div class="span4">
<%@ include file="left.jsp"%>
</div>
<div style="float: right"><a href="logout" 	class="btn btn-danger" ">退出</a></div>

<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12"></div>
		</div>
		<div class="row-fluid">
			<input type="text" id="mobile" placeholder="手机号" class="input-xlarge search-query "style="width:80px;">
	<input type="text" id="realname" placeholder="姓名" class="input-xlarge search-query"style="width:80px;">
    <input type="text" id="idCard" placeholder="证件号码" class="input-xlarge search-query"style="width:80px;">
     <input type="text" id="recommender" placeholder="推荐人" class="input-xlarge search-query"style="width:80px;">
	<select id="select">
	<option id="9">全部</option>
	<option id="1">已认证</option>
	<option id="0">未认证</option>
	</select>	
		<a
			id="search"
			role="button"
			class="btn btn-success"
			data-toggle="modal">查找</a>
		<a href="UserViews" class="btn btn-success">导出Excel</a>
			<div class="span2">
		
			</div>
		
					
				</div>

				<table class="table">
					<thead>
						<tr>
							<th>ID</th>
							<th>用户名</th>
							<th>手机号</th>
							<th>姓名</th>
							<th>证件号码</th>
							<th>用户类型</th>
							<th>推荐人</th>
							<th>认证状态</th>
							<th>注册时间</th>
							<th>认证时间</th>
							<th>详情</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
				<div
					class="pagination"
					style="float: right">
					<ul id="pages">
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
<script src="bootstrap/js/jquery-3.2.1.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script>  

$(document).ready(function() {
	getData(1);

})
var $update;
var page;
//页面加载
function getData(pageIndex) {

	var approvedStatus=$("#select").find("option:selected").attr("id");
   
	page=pageIndex;
	$.ajax({
		type : "get",
		url : "Users",
		data :{
			mobile:$("#mobile").val(),
			realname:$("#realname").val(),
			idCard:$("#idCard").val(),
			recommender:$("#recommender").val(),
			approvedStatus:approvedStatus,
			pageIndex:pageIndex
		
			
		},
		success : function(result) {
	
			showData(result);
			showPage(result);
		}

	})

}
//所有数据
function showData(Json) {

	
	$(".table tbody").empty();
	$
			.each(
					Json.list,
					
					function(index, item) {
						
						var recommender=item.recommender;
						var statu=item.approvedstatus;
						var type=item.userTypeNew;
						var time=new Date(item.createdAt*1000).toLocaleString();
						var time2=new Date(item.approvedAt*1000).toLocaleString();
						if(recommender==null){
							
							recommender="无";
						}
						
						if(statu==1){
							statu="已认证";
						}else if(statu==2){
							statu="未认证";
						}
						if(type==1){
							type="员工";
						}else if(userTypeNew==2){
							type="模特";
						}else if(userTypeNew==3){
							type="供应商";
						}
						else if(userTypeNew==4){
							type="普通用户";
						}
						

						
						var $tr = $("<tr><td>"
								+ item.id
								+ "</td>"
								+ "<td>"
								+item.username
								+ "</td>"
								+ "<td>"
								+ item.mobile
								+ "</td>"
								+"<td>"
								+item.realname
								+"</td>"
								+"<td>"
								+item.idCard
								+"</td>"
								+"<td>"
								+type
								+"</td>"
								+"<td>"
							    +recommender
								+"</td>"
								+"<td>"
								+statu
								+"</td>"
								+"<td>"
								+time
								+"</td>"
								+"<td>"
								+time2
								+"</td>"
								+ "<td>"
							    +"<a  class='detail' href='detail?id="+item.id+"'>详情</a>"
								+ "</td></tr>");
						$(".table tbody").append($tr);
						//修改按钮
						$(".update").click(function(){
							if($(this).html()=="修改"){
								var $value1=$(this).parent().parent().find("td:eq(1)").html();
								$(this).parent().parent().find("td:eq(1)").html("<input class='input1' value='"+$value1+"' id='input1'/>");
								var $value2=$(this).parent().parent().find("td:eq(2)").html();
								$(this).parent().parent().find("td:eq(2)").html("<input class='input1' value='"+$value2+"' id='input2'/>");
							$(this).html("确定");
							}else{
								//修改提交
						    updateData(1);
								$(this).html("修改");
							}
						})
						//删除按钮
						$(".delete").click(function(){
							var id=$("tbody").find("td:eq(0)").html();
							deleteData(id);
							
						})
						
					})

}
//分页显示
function showPage(Json) {

	var pages = Json.pages;
	var pageIndex = Json.pageNum;
	$("#pages").empty();
	if (pageIndex - 1 >= 1) {
		$("#pages").append(
				"<li><a title='" + (pageIndex - 1) + "'>上一页</a></li>")
		
	}
	//导航页
	$.each(Json.navigatepageNums,function(index,item){
	if(item==pageIndex){
		$("#pages").append(
				"<li><a style='color:red' title='"+item+"'>" + item
						+ "</a></li>");
		
	}else{
		$("#pages").append(
				"<li><a  title='"+item+"'>" + item
						+ "</a></li>");
		
	}
	})


	if (pageIndex + 1 <= pages) {
	
		$("#pages").append(
				"<li><a title='" + (pageIndex + 1) + "'>下一页</a></li>");

	}
	//分页执行查询
	$("#pages").find("a").click(function() {

		getData($(this).attr("title"));
	})
}


//模糊搜索资金流水
	$("#search").click(function(){
		getData(1);
	
	})

</script>
</html>