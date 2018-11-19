<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row-fluid">
		<div class="col-lg-12" style="padding:0px">
			<div style="height: 110px;border-bottom:  1px double #000000;padding:35px 10px 0 0 ;">
				<a href="logout" role="button" class="btn btn-default pull-right">
					退出
				</a>
				<span class="pull-right" style="font-size:16px;color:red;margin:5px 5px 0 0 ;vertical-align: middle">欢迎: ${sessionScope.username}</span>
				
			</div>

		</div>
	</div>
</body>
</html>