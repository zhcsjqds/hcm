<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript">
	//提交表单
	function submitWorkageForm(){
		//有效性验证
		if(!$('#workageWindow').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/updateWorkage",$("#workageForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','设置成功!',"info");
				//刷新页面
			}else{
				$.messager.alert('提示','设置失败!',"error");
			}
		},"json");
	}
	
	function closeWorkageWindow(){
		$("#workageForm").form("reset");
	}
	$(function(){
		$.post("${pageContext.request.contextPath}/getWorkage",function(data){
			$("#workageForm").form("load",data);
		},"json");
	});
</script>

<!-- 员工调职窗口 -->
<div style="margin-left:700px;margin-top:10px;">
<form id="workageForm" >
	<table cellpadding="5">
		<tbody>
        	<tr>
				<td>每年增加：</td>
				<td>
					<input name="endowmentins" style="text-align:right;" class="easyui-textbox" data-options="required:true,width:80">&nbsp;%
				</td>
			</tr>
			<tr>
				<td>代扣失业保险(%)：</td>
				<td>
					<input name="unemploymentins" style="text-align:right;" class="easyui-textbox" data-options="required:true,width:80">&nbsp;%
				</td>
			</tr>
			<tr>
	            <td>代扣医疗保险(%):</td>
	            <td>
	            	<input name="medicalins" style="text-align:right;" class="easyui-textbox" data-options="required:true,width:80">&nbsp;%
	            </td>
	        </tr>
			<tr>
	            <td>住房公积金(%):</td>
	            <td>
	                <input class="easyui-textbox" style="text-align:right;" name="housingfund" data-options="required:true,width:80"/>&nbsp;%
	            </td>
	        </tr>
		</tbody>
    </table>
</form>
<div style="padding:5px;margin-left:50px;">
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitWorkageForm()">提交</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeWorkageWindow()">重置</a>
</div>
</div>