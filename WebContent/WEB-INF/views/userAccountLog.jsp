<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>投资交易明细</title>

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
		<a
			id="search"
			role="button"
			class="btn btn-success"
			data-toggle="modal">查找</a>
		
			<div class="span2">
		
			</div>
		
					
				</div>

				<table class="table">
					<thead>
						<tr>
							<th>编号</th>
							<th>手机号</th>
							<th>姓名</th>
							<th>身份证号</th>
							<th>交易金额</th>
							<th>产品名</th>
							<th>交易类型</th>
							<th>交易状态</th>
							<th>交易时间</th>
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
<
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

	page=pageIndex;
	$.ajax({
		type : "get",
		url : "UserAccountLogs",
		data :{
			pageIndex:+pageIndex,
			mobile:$("#mobile").val(),
			realname:$("#realname").val(),
			idCard:$("#idCard").val(),
			
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
						var statu=item.status;
						var type=item.type;
						var time=new Date(item.createdAt*1000).toLocaleString();
						if(statu==1){
							statu="交易成功";
						}else{
							statu="交易失败";
						}
						if(type==31){
							type="申购";
						}
						if(type==57){
							type="赎回";
						}
						console.log(item);
						
						var $tr = $("<tr><td>"
								+ item.id
								+ "</td>"
								+ "<td>"
								+item.user.mobile
								+ "</td>"
								+ "<td>"
								+ item.user.realname
								+ "</td>"
								+"<td>"
								+item.user.idCard
								+"</td>"
								
								+"<td>"
								+item.moneyOperate
								+"</td>"
								+"<td>"
								+item.wish_name 
								+"</td>"
								
								+"<td>"
							    +type
								+"</td>"
								+"<td>"
								+statu
								+"</td>"
								+ "<td>"
							    +time
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