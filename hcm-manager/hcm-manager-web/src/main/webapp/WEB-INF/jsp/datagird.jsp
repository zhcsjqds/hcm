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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<title>Insert title here</title>
<style type="text/css">
.textbox{
	height:20px;
	margin:0;
	padding:0 2px;
	box-sizing:content-box;
}
</style>
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
	
	<div id="tbtn" style="padding:5px">
		<div style="margin-bottom:5px">
			<a class="easyui-linkbutton" iconCls="icon-add" plain="true">添加</a>
			<a class="easyui-linkbutton" iconCls="icon-edit">修改</a>
			<a class="easyui-linkbutton" iconCls="icon-remove">删除</a>
		</div>
		<div style="padding-left:7px;color:#333">
			查询：<input type="text" class="textbox" style="width:110px"></a>
			时间从：<input class="easyui-datebox" type="text" style="width:110px"></input>
			到：<input class="easyui-datebox" type="text" style="width:110px"></input>
			<a class="easyui-linkbutton" iconCls="icon-search">查询</a>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<script>
		$(function(){
			$('#tb').datagrid({
				width:600,
				url:'/hcm-manager-web/json/datagridtest.json',
				title:'用户列表',
				method:'get',
				iconCls:'icon-search',
				columns:[[      //可以合并单元格
						{
							field:"user",
							title:"账号",
							sortable:true
						},
						{
							field:"email",
							title:"邮箱",
							width:100,//全一百，平分自
							sortable:true
						},
						{
							field:"date",
							title:"时间",
							sortable:true,
							formatter:function(value,row,index){
								//if(){}
								
								return '['+value+']'; //可以做过滤
							}
						}
				]],
				pagination:true,
				sortName:'date',
				sortOrder:"DESC",
				remoteSort:false,
				queryParams:{//额外的参数
					id:1
				},
				striped:true,
				nowrap:true,//是否显示一行
				fitColumns:true,//自适应
				rownumbers:true,//显示行号
				singleSelect:true,//只能选择一行
				showHeader:true,
				showFooter:true,//显示行尾，统计可用
				toolbar:'#tbtn'
			});
		});
	</script>
</body>
</html>