<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情信息</title>

</head>
<body>
<a href="User">返回用户管理</a>
<h2>基本信息</h2>
			<table width="978" id="table2">
			  
  </table>
  <h2>资产信息</h2>
  <table width="882" height="47" id="table3">
    
  </table>
 <h2>紧急联系人</h2>
 <table width="687" id="table4">
   <tr>
     <td width="229">姓名:</td>
     <td width="206">关系:</td>
     <td width="230">手机号:</td>
   </tr>
   
 </table>
 <h2>供应商信息</h2>
 <table width="507" id="table5">
   <tr>
     <td width="244">企业名称:</td>
     <td width="247">统一社会信用代码:</td>
   </tr>
   <tr>
     <td>法人姓名:</td>
     <td>法人身份证号:</td>
   </tr>
   <tr>
     <td>企业地址:</td>
     <td>联系电话:</td>
   </tr>
 </table>
 <p>&nbsp;</p>
</body>

<script src="bootstrap/js/jquery-3.2.1.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script >

$(document).ready(function() {
	getData();

})

function getData(){
	$.ajax({
		type : "get",
		url : "Details1",
		success : function(result) {
			console.log(result);
		$("#table2").empty();

		
		 var unixTimestamp2 = new Date(result.submitTime * 1000);
			var commonTime2 = unixTimestamp2.toLocaleString();
			var user2;
			var userTypeNew2=result.type;
			if(userTypeNew2==1){
				user2="员工";
			}
		    var $tr1=$("<tr><td>"+"姓名:"+result.realName+"</td>"+
				"<td>"+"身份证号:"+result.idCard+"</td>"+
				"<td>"+"手机号:"+result.mobile+"</td>"+
				"<td>"+"注册时间:"+commonTime2+"</td>"+
                "</tr>");
		    var $tr2=$("<tr><td>"+"开户行:"+result.bank_name+"</td>"+
				"<td>"+"银行卡号:"+result.bankCard+"</td>"+
				"<td>"+"预留手机号:"+result.reserveMobile+"</td>"+
                "</tr>");
		var $tr3=$("<tr><td>"+"用户类型:"+user2+"</td>"+
				"<td>"+"居住地址:"+"</td>"+
                "</tr>");
			$("#table2").append($tr1);
			$("#table2").append($tr2);
			$("#table2").append($tr3);
			getMoney(); 
	
		}
	})
	}
	function getMoney(){
		$.ajax({
			type:"get",
			url:"UserMoney",
			success:function(msg){
				$("#table3").empty();
				if(msg==null){
					var $tr4=$("<tr><td>"+"账户总资产:"+"</td>"+
							"<td>"+"余额:"+"</td>"+
							"<td>"+"永利宝:"+"</td>"+
							"<td>"+"定期理财:"+"</td>"+
			                "</tr>");
					$("#table3").append($tr4);
				}else{
				
				var $tr4=$("<tr><td>"+"账户总资产:"+msg.moneyTotal+"</td>"+
						"<td>"+"余额:"+msg.moneyUsable+"</td>"+
						"<td>"+"永利宝:"+msg.yonglibao+"</td>"+
						"<td>"+"定期理财:"+msg.moneyTenderFreeze+"</td>"+
		                "</tr>");
				$("#table3").append($tr4);
			
				}
				}})
		
		
	}
</script>
</html>