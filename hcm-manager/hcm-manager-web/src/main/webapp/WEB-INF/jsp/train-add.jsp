<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="margin-left:700px;margin-top:10px;">
	<form id="trainAddForm"  method="post">
	    <table cellpadding="5">
	        <tr>
	            <td>课程名称:</td>
	            <td><input class="easyui-textbox" type="text" name="trainname" data-options="required:true"></input></td>
	        </tr>
	        <tr>
	            <td>开始时间:</td>
	            <td>
	            	<input  id="datebox" name="starttime" class="easyui-datebox" data-options="required:true,editable:false"/>
	            </td>
	        </tr>
	        <tr>
	            <td>结束时间:</td>
	            <td>
	            	<input  id="datebox" name="endtime" class="easyui-datebox" data-options="required:true,editable:false"/>
	            </td>
	        </tr>
	        <tr>
	            <td>选择员工:</td>
	            <td>
	                <input class="easyui-validatebox textbox" type="text" id="staffs" name="staffs" data-options="required:true" />
	            </td>
	        </tr>
	    </table>
	   <!--  <input type="hidden" name="itemParams"/> -->
	</form>
	<div style="margin-left:80px;padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitTrainAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearTrainAddForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	//提交表单
	function submitTrainAddForm(){
		//有效性验证
		if(!$('#trainAddForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/trainAdd",$("#trainAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加成功!',"info");
				clearTrainAddForm();
			}else{
				$.messager.alert('提示','添加失败!',"error");
			}
		},"json");
	}
	
	function clearTrainAddForm(){
		$('#trainAddForm').form('reset');
	}
	
	$(function(){
		$("#staffs").combotree({
			url:"getDepartmentTreeNode",
			method:"get",
			multiple:true,
			lines:true,
			//onlyLeafCheck:true,
			onLoadSuccess:function(node,data){
				if(data){//当有值时
					$(data).each(function(index,value){
						if(this.state == 'closed') {
							$("#staffs").combotree('tree').tree('expandAll');
						}
					});
				}
			}
		});	
	});
</script>
