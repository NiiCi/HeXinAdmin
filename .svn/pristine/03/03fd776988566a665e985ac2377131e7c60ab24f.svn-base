<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-table.css" />
<script src="js/jquery-3.2.1.js" type="text/javascript" charset="utf-8"></script>
<script src="js/highcharts.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap-3.3.7.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/bootstrap-table.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/bootstrap-table-zh-CN.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<style>
ul {
	margin-left: 200px;
	list-style: none;
}

li {
	width: 1100px;
	height: 140px;
}

li div {
	display: inline-block;
	width: 250px;
	height: 90px;
	margin-right: 40px;
	padding: 15px;
	font-size: 12px;
	color: #fff;
}

li div p {
	font-size: 25px;
}
</style>
<body>
	<div class="container-fluid" style="padding:0px;">
		<div class="row-fluid">
			<%@include file="left.jsp"%>
			<div class="pull-left" style="width:90%;">
				<%@include file="head.jsp"%>
				<div class="row-fluid" >
					<div class="col-lg-12" style="background-color: #F5F5F5;padding-top:40px;height: 850px;">
						<div>
							
							<ul>
								<p style="font-size: 16px;padding-bottom:15px;">数据显示</p>
								<li>
									
									<div style="background-color: #16C98D">
										累计余额(元)
										<p>￥10,000,000</p>
									</div>
									<div style="background-color: #00A3DC">
										累计投资总额
										<p>￥${requestScope.sumMoney}</p>
									</div>
									<div style="background-color: #FFC100">
										累计收益(元)
										<p>￥${requestScope.sumProfit}</p>
									</div>
								</li>
								<li>
									<div style="background-color: #684E79">
										累计发放工资总额
										<p>￥${requestScope.labTotal}</p>
									</div>
									<div style="background-color: #E55394">
										累计提现总额
										<p>￥${requestScope.totalWithdraw}</p>
									</div>
									<div style="background-color: #1CA074">
										累计充值金额
										<p>￥0.0</p>
									</div>
								</li>
								<li>
									<div style="background-color: #0B7296">
										有效投资人数
										<p>${requestScope.peopleCount}</p>
									</div>
									<div style="background-color: #FFC100">
										有效提现人数
										<p>${requestScope.withdrawPeopleCount}</p>
									</div>
									<div style="background-color: #684E79">
										活期累计投资总额
										<p>￥${requestScope.yongliAll}</p>
									</div>
								</li>
								<li>
									<div style="background-color: #16C98D">
										定期累计投资总额
										<p>￥${requestScope.sumMoneyByProduct}</p>
									</div>
									<div style="background-color: #00A3DC">
										活期累计收益
										<p>￥${requestScope.yongliProfit}</p>
									</div>
									<div style="background-color: #E55394">
										定期累计收益
										<p>￥${requestScope.sumProductProfit}</p>
									</div>
								</li>
								<li>
									<div style="background-color: #00A3DC">
										永利宝当前规模
										<p>￥${requestScope.yonglibao}</p>
									</div>
									<div style="background-color: #E55394">
										定期当前规模
										<p>￥${requestScope.wishAlreadyMoney}</p>
									</div> <!-- <div></div> -->
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	
</script>
</html>