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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui/equal.js"></script>
</head>
<body>
<div style="margin-left:35%;margin-top:30px;">
	<form id="updatePassword" method="post" >
	 <table cellpadding="5">
	        <tr>
	            <td>旧密码:</td>
	            <td><input id="outpassword" class="easyui-validatebox" type="text" name="oldpassword" required="true" style="width: 200px;"></input></td>
	        </tr>
	        <tr>
	            <td>新密码:</td>
	            <td><input id="newpassword" class="easyui-validatebox" type="password" name="newpassword" required="true" style="width: 200px;"></input></td>
	        </tr>
	        <tr>
	            <td>确认密码:</td>
	            <td><input id="renewpassword" class="easyui-validatebox" type="password" name="renewpassword" required="true" validType="equalTo['#newpassword']"  style="width: 200px;"></input></td>
	        </tr>
	    </table>
	    <div style="padding-top:5px;padding-left:90px">
		    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
		</div>
	</form>
</div>
<script type="text/javascript">
function submitForm(){
	//有效性验证
	if(!$('#updatePassword').form('validate')){
		$.messager.alert('提示','输入不符合要求!',"warning");
		return ;
	}
	//ajax的post方式提交表单
	//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
	$.post("updatePassword",$("#updatePassword").serialize(), function(data){
		if(data.status == 200){
			$.messager.alert('提示','修改密码成功!',"info");
		}else{
			$.messager.alert('提示','修改密码失败!',"error");
		}
	},"json");
}
function clearForm(){
	$('#updatePassword').form('reset');
}
</script>
</body>
</html>