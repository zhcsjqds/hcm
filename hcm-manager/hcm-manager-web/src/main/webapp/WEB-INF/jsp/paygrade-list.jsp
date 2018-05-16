<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
	$(function(){
		objpay = {
				add:function(){
					$("#paygradeAddWindow").css({visibility:"visible"});
					$("#paygradeAddWindow").window({
						title:"添加工资等级",
						width:400,
						top:200,
						left:730,
						modal:true,
						shadow:true,
						height:350,
						resizable:false,
						cache : false
					}).window("open");
				},
				edit:function(){
					var rows = $('#paygradeList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择需要修改的员工！","warning");
					}else{
						$("#paygradeEditWindow").css({visibility:"visible"});
						var paygrade = rows[0];//json对象
						$("#paygradeEditWindow").window({
							title:"修改员工信息",
							width:400,
							top:200,
							left:730,
							modal:true,
							shadow:true,
							height:320,
							resizable:false,
							cache : false
						}).window("open");
						$("#paygradeEditForm").form("load",paygrade);
					}
				},
				remove:function(){
					var rows = $('#paygradeList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择一条工资等级！","warning");
					}else{
						//选中。弹出确认框
						$.messager.confirm("删除确认","您确定要删除该工资等级吗？",function(r){
							if(r){
								//确定，发送请求
								var paygrade = rows[0];//json对象
								$.post("deletePaygrade",paygrade, function(data){
			            			if(data.status == 200){
			            				$.messager.alert('提示','删除成功!',"info",function(){
			            					$("#paygradeList").datagrid("reload");
			            				});
			            			}else{
			            				$.messager.alert('提示','删除失败!',"error");
			            			}
			            		},"json");
							}
						});
					}
				},
				search:function(){
					$("#paygradeList").datagrid("load",{
						headship : $.trim($('input[name="searchbyposition"]').val())
					});
				},
				searchall:function(){
					$("#paygradeList").datagrid("load",{
					});
				}
		};
		
		
		
		
		$('#paygradeList').datagrid({
			url:'paygradelist',
			title:'工资等级列表',
			method:'get',
			columns:[[      //可以合并单元格
					{
						field:"paygradeno",
						title:"等级编号",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"headship",
						title:"职位",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"headshippay",
						title:"基本工资",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"allowance",
						title:"补贴",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"paygradedescribe",
						title:"描述",
						width:50,
						sortable:true
					}
			]],
			pagination:true,//分页条
			sortName:'paygradeno',
			sortOrder:"DESC",
			remoteSort:false,
			/* onDblClickRow : doDblClickRow, */
			/* queryParams:{//额外的参数
				status:"在职",
				realname:""
			}, */
			striped:true,
			nowrap:true,//是否显示一行
			fitColumns:true,//自适应
			rownumbers:true,//显示行号
			singleSelect:true,//只能选择一行
			//showHeader:true,
			//showFooter:true,//显示行尾，统计可用 
			toolbar:"#toolbar-pay"
		});
	});
	
	//提交添加表单
	function submitAddForm(){
		//有效性验证
		if(!$('#paygradeAddForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/paygradeAdd",$("#paygradeAddForm").serialize(), function(data){
			if(data.status == 200){
				objpay.searchall();
				$.messager.alert('提示','添加成功!',"info");
				$('#paygradeAddForm').form('reset');
				//关闭窗口
				$("#paygradeAddWindow").window({}).window("closed");
				//刷新页面
			}else{
				$.messager.alert('提示','添加失败!',"error");
			}
		},"json");
	}
	
	function clearAddForm(){
		$('#paygradeAddForm').form('reset');
	}
	
	//提交修改表单
	function submitEditForm(){
		//有效性验证
		if(!$('#paygradeEditForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/paygradeEdit",$("#paygradeEditForm").serialize(), function(data){
			if(data.status == 200){
				objpay.searchall();
				$.messager.alert('提示','修改成功!',"info");
				//关闭窗口
				$("#paygradeEditWindow").window({}).window("closed");
				//刷新页面
			}else{
				$.messager.alert('提示','修改失败!',"error");
			}
		},"json");
	}
	
	function clearEditForm(){
		$('#paygradeEditForm').form('reset');
	}
	
	//提交表单
	function submitTransferForm(){
		//有效性验证
		if(!$('#paygradeTransferForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		//$("#staffEditForm").serialize()将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/staffTransfer",$("#staffTransferForm").serialize(), function(data){
			if(data.status == 200){
				obj.searchzz();
				$.messager.alert('提示','员工调职成功!',"info");
				$("#staffTransferWindow").window({}).window("closed");
				//刷新页面
			}else{
				$.messager.alert('提示','员工调职失败!',"error");
			}
		},"json");
	}
	
	function closeTransferWindow(){
		$('#paygradeTransferWindow').window({}).window('closed');
	}
</script>

<!-- 工资等级列表 -->
<table id="paygradeList"></table>

<!-- 工具栏 -->
<div id="toolbar-pay" style="padding:5px;">
	<div>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="objpay.add();">添加</a>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="objpay.edit();">修改</a>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="objpay.remove();">删除</a>
		<span style="margin-left:400px;">职位：</span><input name="searchbyposition" id="searchposition">
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="objpay.search();">查询</a>
	</div>
</div>

<!-- 添加工资等级窗口 -->
<div id="paygradeAddWindow" class="easyui-window" data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="paygradeAddForm">
		<table cellpadding="5">
	        <tr>
	            <td>等级编号:</td>
	            <td><input class="easyui-textbox" type="text" name="paygradeno" data-options="required:true"></input></td>
	        </tr>
	        <tr>
		            <td>部门:</td>
		            <td>
		                <input id="departmentid" name="newdepartmentid"/>
		            	<script type="text/javascript">
		            		$(function(){
		            			var department = $("#departmentid").combobox({
		            				url:'${pageContext.request.contextPath}/findDepartmentList',
		            				editable:false,
		            				required:true,
		            				method:'get',
		            				panelHeight:'auto',
		            				valueField:'departmentid',
		            				textField:'departmentname',
		            				onSelect:function(data){  
		            					position.combobox({  
				                                disabled:false,  
				                                url:"${pageContext.request.contextPath}/findPositionList?departmentid="+data.departmentid,  
				                                valueField:'positionname',  
				                                textField:'positionname',
				                                panelHeight:'auto'
				                            }).combobox('clear');
		            	            }  
		            			});
		            			var position = $("#positionid").combobox({
		            				editable:false,
		            				required:true,
		            				method:'get',
		            				panelHeight:'auto'
		            			});
		            		});
		            		$(function(){
		             			$("#searchposition").combobox({
		             				url:'${pageContext.request.contextPath}/findAllPositionList',
		             				editable:false,
		             				required:true,
		             				method:'get',
		             				valueField:'positionname',
		             				textField:'positionname'
		             			});
		             		});
		            	</script>
		            </td>
		        </tr>
		        <tr>
		        	<td>职位</td>
		        	<td>
		        		 <input id="positionid" name="headship"/>
		        	</td>
		        </tr>
	        <tr>
	            <td>基本工资:</td>
	            <td>
	                <input class="easyui-numberbox" type="text" name="headshippay" data-options="required:true" />
	            </td>
	        </tr>
	        <tr>
	            <td>补贴:</td>
	            <td>
	                <input class="easyui-numberbox" type="text" name="allowance" data-options="required:true" />
	            </td>
	        </tr>
	        <tr>
	            <td>描述:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="paygradedescribe" data-options="required:true,multiline:true" style="width:200px;height:50px"/>
	            </td>
	        </tr>
	    </table>
	    <input type="hidden" name="paygradeid">
	</form>
	<div style="padding:5px;margin-left:50px;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearAddForm()">重置</a>
	</div>
</div>

<!-- 修改工资等级窗口 -->
<div id="paygradeEditWindow" class="easyui-window" data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="paygradeEditForm">
		<table cellpadding="5">
	        <tr>
	            <td>等级编号:</td>
	            <td><input class="easyui-textbox" type="text" name="paygradeno" data-options="required:true" readonly></input></td>
	        </tr>
	        <tr>
				<td>原职位：</td>
				<td>
					<input name="headship" style="border:0px;disabled:true" readonly>
				</td>
			</tr>
	        <tr>
	            <td>基本工资:</td>
	            <td>
	                <input class="easyui-numberbox" type="text" name="headshippay" data-options="required:true" />
	            </td>
	        </tr>
	        <tr>
	            <td>补贴:</td>
	            <td>
	                <input class="easyui-numberbox" type="text" name="allowance" data-options="required:true" />
	            </td>
	        </tr>
	        <tr>
	            <td>描述:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="paygradedescribe" data-options="required:true,multiline:true" style="width:200px;height:50px"/>
	            </td>
	        </tr>
	    </table>
	    <input type="hidden" name="paygradeid">
	</form>
	<div style="padding:5px;margin-left:50px;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitEditForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearEditForm()">重置</a>
	</div>
</div>