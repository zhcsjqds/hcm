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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ztree/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/function.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/load.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/formatDate.js"></script>
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
	.textbox{
	height:20px;
	margin:0;
	padding:0 2px;
	box-sizing:content-box;
	}	
</style>
<title>企业人事管理系统</title>
</head>
<body class="easyui-layout">
	<!-- 北 -->
	<div style="height: 100px" data-options="region:'north',noheader:true,split:true,maxHeight:100,minHeight:100,border:false"">
		<img alt="标题" src="${pageContext.request.contextPath}/images/top.png" style="height:100%;margin-left:10%">
		<a data-options="iconCls:'icon-help',menu:'#mm'" class="easyui-menubutton" style="position:absolute;right:40px;bottom:10px;">我的信息</a>
		<div id="mm">
			<div onclick="alert(111)">个人信息</div>
			<div data-options="iconCls:'icon-edit'" onclick="changePassword();">修改密码</div>
			<div class="menu-sep"></div>
			<div onclick="logout();">退出系统</div>
		</div>
		<a href="${pageContext.request.contextPath}/logout" style="position:absolute;right:10px;bottom:12px;font-size:12px">退出</a>
	</div>
	<!-- 西 -->
	<div title="系统菜单" style="width: 200px;" data-options="region:'west',split:true,maxWidth:200,minWidth:200">
		<div class="easyui-accordion" data-options="fit:true">
			<div title="员工管理">
				<ul id="navtree"></ul>
				
				<!-- 使用简单json数据构造ztree -->
				<!-- <ul id="ztree3" class="ztree"></ul>
				<script type="text/javascript">
					$(function() {
						//动态创建ztree
						var setting3 = {
							data : {
								simpleData : {
									enable : true
								//使用简单json数据构造ztree节点
								}
							},
							callback : {
								onClick : function(event, treeId, treeNode) {
									var content = '<div style="width:100%;height:100%;overflow:hidden;">'
										+ '<iframe src="'
										+ treeNode.page
										+ '" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';
									if (treeNode.page != undefined) {
										var e = $("#mytabs").tabs("exists",
												treeNode.name);
										if (e) {
											var e = $("#mytabs").tabs("select",
													treeNode.name);
										} else {
											$("#mytabs").tabs("add", {
												title : treeNode.name,
												closable : true,
												content:content
											});
										}
									}
								}
							}
						};
						//发送ajax请求，获取json数据
						//jQuery提供 的ajax方法：ajax、post、get、load、getJSON、getScript
						var url = "${pageContext.request.contextPath}/json/menu.json";
						$.get(url, {}, function(data) {
							//调用API初始化ztree
							$.fn.zTree.init($("#ztree3"), setting3, data);
						}, 'json');
					});
				</script> -->
			</div>
			<div title="薪资管理"></div>
			<div title="培训管理"></div>
			<div title="考勤管理"></div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="mytabs" class="easyui-tabs" data-options="fit:true,border:false">
		</div>
	</div>
	<!-- 	<div style="width: 100px" data-options="region:'east'">东</div> -->
	<div style="height: 50px;" data-options="region:'south',noheader:true,split:true,maxHeight:50,minHeight:50,border:false"">南</div>

</body>
</html>