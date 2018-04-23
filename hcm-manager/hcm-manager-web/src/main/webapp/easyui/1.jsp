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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/ztree/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ztree/jquery.ztree.all.js"></script>
<title>Insert title here</title>
</head>
<body class="easyui-layout">
	<!-- 使用div描述每个区域 -->
	<div title="华超人事管理系统" style="height: 100px"
		data-options="region:'north'">北</div>
	<div title="系统菜单" style="width: 200px" data-options="region:'west'">
		<!-- 制作according折叠面板 -->
		<!-- fit:true自适应 -->
		<div class="easyui-accordion" data-options="fit:true">
			<div data-options="iconCls:'icon-mini-add'" title="面板一">
				<a id="btn1" class="easyui-linkbutton">添加</a>
				<script type="text/javascript">
					$(function() {
						$("#btn1").click(function() {
							//判断选项卡是否存在
							var e = $("#mytabs").tabs("exists","系统管理");
							if(e){
								$("#mytabs").tabs("select","系统管理");
							}else{
								//添加一个选项卡
								$("#mytabs").tabs("add",{
									title:'系统管理',
									iconCls:"icon-edit",
									closable:true,
									content:"x"
								});
							}
						});
					});
				</script>
			</div>
			<div title="面板二">
				<!-- 使用标准json数据构造ztree -->
				<ul id="ztree1" class="ztree"></ul>
				<script type="text/javascript">
					$(function(){
						//动态创建ztree
						var setting = {};
						//构造节点数据
						var zNodes = [
							{"name":"节点1","children":[
								{"name":"节点1-1"},
								{"name":"节点1-2"}
							]},
							{"name":"节点2"},
							{"name":"节点3"}
						];   
						//调用API初始化ztree
						$.fn.zTree.init($("#ztree1"),setting,zNodes);
					});
				</script>
			</div>
			<div title="面板三">
				<!-- 使用简单json数据构造ztree -->
				<ul id="ztree2" class="ztree"></ul>
				<script type="text/javascript">
					$(function(){
						//动态创建ztree
						var setting2 = {
								data: {
									simpleData: {
										enable: true//使用简单json数据构造ztree节点
									}
								}
						};
						//构造节点数据
						var zNodes2 = [
							{"id":"1","pId":"0","name":"节点1"},
							{"id":"2","pId":"1","name":"节点2"},
							{"id":"3","pId":"2","name":"节点3"}
						];   
						//调用API初始化ztree
						$.fn.zTree.init($("#ztree2"),setting2,zNodes2);
					});
				</script>
			</div>
			<div title="面板四">
				<!-- 使用简单json数据构造ztree -->
				<ul id="ztree3" class="ztree"></ul>
				<script type="text/javascript">
					$(function(){
						//动态创建ztree
						var setting3 = {
								data: {
									simpleData: {
										enable: true//使用简单json数据构造ztree节点
									}
								},
								callback: {
									onClick: function(event, treeId, treeNode){
										if(treeNode.page != undefined){
											var e = $("#mytabs").tabs("exists",treeNode.name);
											if(e){
												var e = $("#mytabs").tabs("select",treeNode.name);
											}else{
												$("#mytabs").tabs("add",{
													title:treeNode.name,
													closable:true,
													content:"m"
												});
											}
										}
									}
								}
						};
					//发送ajax请求，获取json数据
					//jQuery提供 的ajax方法：ajax、post、get、load、getJSON、getScript
						var url = "${pageContext.request.contextPath}/json/menu.json";
						$.get(url,{},function(data){
							//调用API初始化ztree
							$.fn.zTree.init($("#ztree3"), setting3, data);
						},'json');
				});
				</script>
			</div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="mytabs" class="easyui-tabs" data-options="fit:true">
			<div data-options="iconCls:'icon-mini-add'" title="面板一"></div>
			<div data-options="closable:true" title="面板二"></div>
			<div title="面板三"></div>
		</div>
	</div>
	<div style="width: 100px" data-options="region:'east'">动</div>
	<div style="height: 50px" data-options="region:'south'">南</div>
</body>
</html>