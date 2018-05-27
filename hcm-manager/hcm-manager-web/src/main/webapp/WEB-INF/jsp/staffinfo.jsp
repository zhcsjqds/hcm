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
11
<div style="margin-left:35%;margin-top:30px;">
	<div id="staffInfo"  data-options="url:'staffinfo'" style="padding:20px;">
	<form id="InfoForm" >
		<table >
			<tbody>
				<tr>
					<td>姓名：</td>
					<td>
						<input name="realname" style="disabled:true;border:0px;" readonly>
					</td>
				</tr>
				<tr>
					<td>性别：</td>
					<td>
						<input style="disabled:true;border:0px;" name="gender" readonly>
					</td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td>
						<input name="age" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>血型：</td>
					<td>
						<input name="bloodtype" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>学历：</td>
					<td>
						<input name="education" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>工龄：</td>
					<td>
						<input name="workage" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>部门：</td>
					<td>
						<input name="department" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>职位：</td>
					<td>
						<input name="position" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				
				<tr>
					<td>职称：</td>
					<td>
						<input name="title" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>政治面貌：</td>
					<td>
						<input name="politicsstatus" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>籍　　贯：</td>
					<td>
						<input name="nativaplace" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>婚姻状况：</td>
					<td>
						<input name="maritalstatus" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>手机号码：</td>
					<td>
						<input name="phone" style="border:0px;disabled:true" readonly >
					</td>
				</tr>
				<tr>
					<td>电子邮箱：</td>
					<td>
						<input name="email" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>入职日期：</td>
					<td>
						<input name="entrydate" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>生日日期：</td>
					<td>
						<input name="birthday" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>身份证号：</td>
					<td>
						<input name="identityid" style="border:0px;" readonly>
					</td>
				</tr>
				<tr>
					<td>银行卡号：</td>
					<td>
						<input name="bankcard" style="border:0px" readonly>
					</td>
				</tr>
				<tr>
					<td valign='top'>联系地址：</td>
					<td>
					<textarea readonly rows="2" cols="25" name="address" style="disabled:true;resize: none;border:none;font-size: 12px;"></textarea>
						<!-- <input name="address" class="easyui-textbox" data-options="multiline:true,border:false" style="disabled:true;width:200px;height:50px;"> -->
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
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