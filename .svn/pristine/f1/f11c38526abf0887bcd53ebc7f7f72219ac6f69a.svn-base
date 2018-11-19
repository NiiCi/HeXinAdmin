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
<body>
	<div class="container-fluid" style="padding:0px;">
		<div class="row-fluid">
			<%@include file="left.jsp"%>
			<div class="pull-left" style="width:90%;">
				<%@include file="head.jsp"%>
				<div class="row-fluid">
					<div class="col-lg-12"  style="background-color: #F5F5F5;padding-top:40px;height: 850px;">
						<div class="control-group">
							<form class="form-inline" role="form"
								style="float: left; width: 100%" method="post" id="queryForm">
								<div class="form-group">
									<label for="userName">手机号:</label> <input style="width: 100px;"
										type="text" class="form-control" name="mobile" id="mobile"
										placeholder="手机号">
								</div>
								<div class="form-group">
									<label>真实姓名:</label> <input style="width: 100px;"
										placeholder="真实姓名" class="form-control layer-date"
										id="realname" name="realname">
								</div>
								<div class="form-group">
									<label>证件号码:</label> <input style="width: 180px;"
										placeholder="证件号码" class="form-control layer-date" id="idCard"
										name="idCard">
								</div>
								<div class="form-group">
									<button type="button" id="queryBtn" class="btn btn-primary">查询</button>
								</div>
								<div class="form-group ">
									<button type="button" class="btn btn-primary" id="bufa">补发活期收益</button>
								</div>
							</form>

						</div>

						<table id="demo-table" class="table">

						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		initTable();
		$('#demo-table').on("click-row.bs.table",function(field,value,row,$element) {
		/* var  index= $element.data('index'); */
		
		//点击事件
		console.log(field);
		//value
		console.log(value);
		//当前点击的行
		console.log(row);
		//当前点击的列
		console.log($element);
		console.log(row.data('index'));
		});
		/* initDate(); */
	});

	//综合查询
	$("#queryBtn").click(function(params){
		$('#demo-table').bootstrapTable('refresh'); //刷新表格
	})
	
	//补发活期收益事件
	$("#bufa").click(function(params){
		if (confirm("您确定药补发永利宝收益吗?")) {
			$.ajax({
				type:"put",
				url:"userProfitsDetailController",
				success:function(data){
					console.log(data);
					if (data == 'success') {
						alert("补发永利宝收益成功!");
						
					}else if(data == 'not_success'){
						alert("补发部分永利宝收益,请联系管理员获知详情!");
					}else{
						alert("收益已成功发放，无需补发!");
					}
				},
				complete:function(){
					$('#demo-table').bootstrapTable('refresh');
				}
			})
		}else{
			$('#demo-table').bootstrapTable('refresh');
		}
		
	})
		
	
	/* function doQuery(params) {
		
	} */
	//bootstrap Tablt 初始化
	function initTable() {
		console.log("1");
		$('#demo-table').bootstrapTable({
			method : 'GET',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded",
			cache : false,
			striped : true, //是否显示行间隔色
			/* search:true,//是否使用搜索框 */
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			url : "userProfitsDetailController",
			height : $(window).height() - 180,
			width : $(window).width(),
			showColumns : true,
			pagination : true,
			queryParams : queryParams,
			minimumCountColumns : 2,
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 10, //每页的记录行数（*）
			pageList : [ 5,10, 25, 50, 100 ], //可供选择的每页的行数（*）
			uniqueId : "id", //每一行的唯一标识，一般为主键列
			showExport : true,
			exportDataType : 'all',
			responseHandler : responseHandler,
			columns : [ {
				field : 'id',
				title : 'ID',
				align : 'center',
				valign : 'middle',
				sortable : true

			}, {
				field : 'user.mobile',
				title : '手机号',
				align : 'center',
				valign : 'middle',

			}, {
				field : 'user.realname',
				title : '真实姓名',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'user.idCard',
				title : '证件号码',
				align : 'center',
				valign : 'middle',

			}, {
				field : 'profits',
				title : '收益',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'productName',
				title : '产品名称',
				align : 'center',
				valign : 'left',
			
			}, {
				field : 'profitDay',
				title : '收益日期',
				align : 'center',
				valign : 'middle',
				formatter : function(value, row, index) {
					console.log(row);
					var date = new Date(value*1000);
					var month = date.getMonth()+1 < 10 ? "0"+(date.getMonth()+1):date.getMonth()+1;
					var day = date.getDate() < 10 ? "0"+date.getDate():date.getDate();
					var hours = date.getHours() < 10 ? "0"+date.getHours():date.getHours();
					var minutes = date.getMinutes() < 10 ? "0"+date.getMinutes():date.getMinutes(); 
					var seconds = date.getSeconds() < 10 ? "0"+date.getSeconds():date.getSeconds();
					return date.getFullYear()+"-"+month+"-"+day+"-"+hours+":"+minutes+":"+seconds;
					/* return (Array(4).join(0) + value.year).slice(-4) + "-" + (Array(2).join(0) + value.monthValue).slice(-2) + "-" + (Array(2).join(0) + value.dayOfMonth).slice(-2) + "&nbsp;" + (Array(2).join(0) + value.hour).slice(-2) + ":" + (Array(2).join(0) + value.minute).slice(-2) + ":" + (Array(2).join(0) + value.second).slice(-2); */
				} 
			}, {
				field : 'status',
				title : '交易状态',
				align : 'center',
				valign : 'middle',
				formatter:function(value,row,index){
					var flag = value = 1 ? "交易成功":"交易失败";
					return flag;
				}
			} ]
		});
	}

	function initDate() {
		var start = {
			elem : '#startDate',
			format : 'YYYY-MM-DD hh:mm:ss',
			min : laydate.now(-7),
			max : laydate.now(),
			istime : true,
			istoday : false,
			choose : function(datas) {
				end.min = datas; //开始日选好后，重置结束日的最小日期
				end.start = datas //将结束日的初始值设定为开始日
			}
		};
		var end = {
			elem : '#endDate',
			format : 'YYYY-MM-DD hh:mm:ss',
			min : laydate.now(-7),
			max : laydate.now(),
			istime : true, //是否开启时间选择
			isclear : true, //是否显示清空
			istoday : true, //是否显示今天
			issure : true, //是否显示确认
			choose : function(datas) {
				start.max = datas; //结束日选好后，重置开始日的最大日期
			}
		};
		laydate(start);
		laydate(end);
	}

	function queryParams(params) {
		var param = {
			mobile : $("#mobile").val(),
		 	realname : $("#realname").val(),
			idCard : $("#idCard").val(),
			limit : params.limit, // 页面大小
			offset : params.offset, // 页码
		}
		return param;
	}

	// 用于server 分页，表格数据量太大的话 不想一次查询所有数据，可以使用server分页查询，数据量小的话可以直接把sidePagination: "server"  改为 sidePagination: "client" ，同时去掉responseHandler: responseHandler就可以了，
	function responseHandler(res) {
		if (res) {
			return {
				"rows" : res.rows,
				"total" : res.total
			};
		} else {
			return {
				"rows" : [],
				"total" : 0
			};
		}
	}
	
</script>
</html>