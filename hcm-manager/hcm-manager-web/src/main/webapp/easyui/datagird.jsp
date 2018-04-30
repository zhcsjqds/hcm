<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<!-- <table class="easyui-datagrid" data-options="width:400">
		<thead>
			<tr>
				<th data-options="field:'user'">账号</th>
				<th data-options="field:'email'">邮件</th>
				<th data-options="field:'time'">时间</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>蜡笔小新</td>
				<td>xiaoxin@11.com</td>
				<td>2012-2-2</td>
			</tr>
		</tbody>
	</table> -->
	<table id="tb"></table>
	<script>
		$(function(){
			$('#tb').datagrid({
				width:400,
				url:'/hcm-manager-web/json/datagridtest.json',
				title:'用户列表',
				method:'get',
				iconCls:'icon-search',
				columns:[[      //可以合并单元格
						{
							field:"user",
							title:"账号"
						},
						{
							field:"email",
							title:"邮箱"
						},
						{
							field:"time",
							title:"时间"
						}
				]]
			});
		});
	</script>
</body>
</html>