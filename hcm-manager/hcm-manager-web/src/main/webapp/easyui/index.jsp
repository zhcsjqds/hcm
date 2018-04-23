<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/ztree/zTreeStyle/zTreeStyle.css"
	type="text/css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all.js"></script>
<title>企业人事管理系统</title>
</head>
<body class="easyui-layout">
	<div style="height: 100px" data-options="region:'north'">
		<img alt="标题" src="${pageContext.request.contextPath}/images/top.png" style="height:100%;margin-left:10%">
	</div>
	<div title="系统菜单" style="width: 200px" data-options="region:'west'">
		<div class="easyui-accordion" data-options="fit:true">
			<div title="员工管理">
				<!-- 使用简单json数据构造ztree -->
				<ul id="ztree3" class="ztree"></ul>
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
												content : "m"
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
				</script>
			</div>
			<div title="薪资管理"></div>
			<div title="培训管理"></div>
			<div title="考勤管理"></div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="mytabs" class="easyui-tabs" data-options="fit:true">
		</div>
	</div>
	<!-- 	<div style="width: 100px" data-options="region:'east'">东</div> -->
	<div style="height: 50px" data-options="region:'south'">南</div>

</body>
</html>