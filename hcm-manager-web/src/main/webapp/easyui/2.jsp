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
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$.messager.alert("标题","内容","question");
		$.messager.alert("标题","内容","warning");
		$.messager.alert("标题","内容","error");
		$.messager.alert("标题","内容","info");
		$.messager.confirm("标题","内容",function(r){
			alert(r);
		});
		$.messager.show({
			title:"欢迎",
			msg:"欢迎【admin】登录系统！",
			timeout:5000,
			showType:"slide"
		});
	});
</script>
</head>
<body>
	
</body>
</html>