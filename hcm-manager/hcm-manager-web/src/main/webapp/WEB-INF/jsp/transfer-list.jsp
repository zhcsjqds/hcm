<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script>
	$(function(){
		tra = {
				search:function(){
					$("#transferList").datagrid("load",{
						realname : $.trim($('input[name="searchbyname"]').val())
					});
				}
		};
		
		$('#transferList').datagrid({
				url:'transferList',
				title:'调职记录',
				method:'get',
				columns:[[      //可以合并单元格
						{
							field:"staffid",
							title:"员工编号",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"staffrealname",
							title:"姓名",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"newjob",
							title:"新职位",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"newdepartment",
							title:"新部门",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"lastjob",
							title:"原职位",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"lastdepartment",
							title:"原部门",
							width:70,//全一百，平分自
							sortable:true
						},
						{
							field:"transreason",
							title:"说明",
							width:50,
							sortable:true
						},
						{
							field:"transtime",
							title:"调职时间",
							width:100,//全一百，平分自
							sortable:true,
							formatter:formatDatebox
						},
						{
							field:"applicant",
							title:"申请者",
							width:80,//全一百，平分自
							sortable:true
						},
						{
							field:"approver",
							title:"审批者",
							width:100,//全一百，平分自
							sortable:true
						}
				]],
				pagination:true,//分页条
				sortName:'transtime',
				sortOrder:"DESC",
				remoteSort:false,
				queryParams:{//额外的参数
					status:"已通过"
				},
				striped:true,
				nowrap:true,//是否显示一行
				fitColumns:true,//自适应
				rownumbers:true,//显示行号
				singleSelect:true,//只能选择一行
				toolbar:"#toolbar-t"
			});
		});
</script>

<!-- 离职记录表 -->
<table id="transferList"></table>
<div id="toolbar-t" style="padding:8px;">
	<div>
		<span>姓名：</span><input class="easyui-textbox" name="searchbyname">
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="tra.search();">查询</a>
	</div>
</div>		