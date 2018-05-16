<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
	$(function(){
		objpayupdate = {
				update:function(){
					var rows = $('#staffListHasPaygrade').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择需要工资升级的员工！","warning");
					}else{
						$("#paygradedescribe2").val("");
						$("#staffUpdatePayGradeWindow").css({visibility:"visible"});
						var staff = rows[0];//json对象
						var position2 = staff.position;
            			$("#newpaygradeid").combobox({
            				url:'${pageContext.request.contextPath}/findPaygradenoByPosition?position='+position2,
            				editable:false,
            				required:true,
            				width:100,
            				panelHeight:'auto',
            				method:'get',
            				valueField:'paygradeno',
            				textField:'paygradeno',
            				onSelect:function(data){
            					//选择工资等级后，显示相关描述
            					$.post("${pageContext.request.contextPath}/findPaygradeByPaygradeno",{"paygradeno":data.paygradeno}, function(data){
            						$("#paygradedescribe2").val(data.paygradedescribe);
            					},"json");
            	            }  
            			});
            			
						$("#staffUpdatePayGradeWindow").window({
							title:"工资定级",
							width:380,
							top:160,
							left:730,
							modal:true,
							shadow:true,
							height:300,
							resizable:false,
							cache : false
						}).window("open");
						$("#staffUpdatePayGradeForm").form("load",staff);
					}
				},
				search:function(){
					$("#staffListHasPaygrade").datagrid("load",{
						realname : $.trim($('input[name="searchbynameforpayup"]').val()),
						status :"在职",
						paygrade:"notnull"
					});
				},
				searchall:function(){
					$("#staffListHasPaygrade").datagrid("load",{
						realname :"",
						status :"在职",
						paygrade:"notnull"
					});
				}
		};
		
		$('#staffListHasPaygrade').datagrid({
			url:'stafflist',
			title:'尚未工资定级员工列表',
			method:'get',
			columns:[[      //可以合并单元格
					{
						field:"staffno",
						title:"员工编号",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"realname",
						title:"姓名",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"position",
						title:"职位",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"department",
						title:"部门",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"gender",
						title:"性别",
						width:50,
						sortable:true
					},
					{
						field:"age",
						title:"年龄",
						width:50,//全一百，平分自
						sortable:true
					},
					{
						field:"education",
						title:"学历",
						width:50,//全一百，平分自
						sortable:true
					},
					{
						field:"status",
						title:"状态",
						width:50,//全一百，平分自
						sortable:true
					},
					{
						field:"entrydate",
						title:"入职时间",
						width:100,//全一百，平分自
						sortable:true
						//formatter:formatDatebox
					},
					{
						field:"workage",
						title:"工龄",
						width:80,//全一百，平分自
						sortable:true
					},
				 	{
						field:"paygrade",
						title:"工资等级",
						width:80,//全一百，平分自
						sortable:true
					},
					{
						field:"title",
						title:"职称",
						width:100,//全一百，平分自
						hidden:true
					}
			]],
			pagination:true,//分页条
			sortName:'staffno',
			sortOrder:"DESC",
			remoteSort:false,
			queryParams:{//额外的参数
				paygrade:"notnull",
				realname:"",
				status :"在职"
			},
			striped:true,
			nowrap:true,//是否显示一行
			fitColumns:true,//自适应
			rownumbers:true,//显示行号
			singleSelect:true,//只能选择一行
			toolbar:"#toolbarup"
		});
	});
	
	//提交表单
	function submitUpdatePayGradeForm(){
		//有效性验证
		if(!$('#staffUpdatePayGradeWindow').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		$.post("${pageContext.request.contextPath}/updatePayGrade",$("#staffUpdatePayGradeForm").serialize(), function(data){
			if(data.status == 200){
				objpayupdate.searchall();
				$.messager.alert('提示','工资升级成功!',"info");
				$("#staffUpdatePayGradeWindow").window({}).window("closed");
				//刷新页面
			}else{
				$.messager.alert('提示','工资升级失败!',"error");
			}
		},"json");
	}
	
	function closeUpdatePayGradeWindow(){
		$('#staffUpdatePayGradeWindow').window({}).window('closed');
	}
</script>

<!-- 员工列表 -->
<table id="staffListHasPaygrade"></table>

<!-- 工具栏 -->
<div id="toolbarup" style="padding:5px;">
	<div>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="objpayupdate.update();">工资升级</a>
		<span style="margin-left:400px;">姓名：</span><input class="easyui-textbox" name="searchbynameforpayup">
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="objpayupdate.search();">查询</a>
	</div>
</div>

<!-- 员工调职窗口 -->
<div id="staffUpdatePayGradeWindow" class="easyui-window" data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="staffUpdatePayGradeForm">
		<table cellpadding="5">
			<tbody>
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
		            <td>原工资等级:</td>
		            <td>
		            	<input name="paygrade" style="border:0px;disabled:true" readonly>
		            </td>
		        </tr>
				<tr>
		            <td>新工资等级:</td>
		            <td>
		                <input id="newpaygradeid" name="newpaygrade"/>
		            </td>
		        </tr>
		        <tr>
		        	<td>新等级描述：</td>
		        	<td>
		        		<textarea class="textbox"  readonly rows="2" cols="25" id="paygradedescribe2" name="newpaygradedescribe" style="disabled:true;resize: none;font-size: 12px;height:40px;"></textarea>
		        	</td>
		        </tr>
			</tbody>
	    </table>
	    <input type="hidden" name="staffid">
	</form>
	<div style="padding:5px;margin-left:50px;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitUpdatePayGradeForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeUpdatePayGradeWindow()">取消</a>
	</div>
</div>