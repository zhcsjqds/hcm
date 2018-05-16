<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript">
	//提交表单
	function submitRateForm(){
		//有效性验证
		if(!$('#rateForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/updateRate",$("#rateForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','设置成功!',"info");
				//刷新页面
			}else{
				$.messager.alert('提示','设置失败!',"error");
			}
		},"json");
	}
	
	function closeRateWindow(){
		$("#rateForm").form("reset");
	}
	$(function(){
		$.post("${pageContext.request.contextPath}/getRate",function(data){
			$("#rateForm").form("load",data);
		},"json");
	});
</script>

<!-- 员工调职窗口 -->
<div style="margin-left:700px;margin-top:10px;">
<form id="rateForm" >
	<table cellpadding="5">
		<tbody>
        	<tr>
				<td>代扣养老保险(%)：</td>
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
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitRateForm()">提交</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeRateWindow()">重置</a>
</div>
</div>