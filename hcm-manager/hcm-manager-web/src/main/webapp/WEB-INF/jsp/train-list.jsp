<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
	$(function(){
		objtrain = {
				editRow:undefined,
				add:function(){
					$(".tree-title:contains('添加培训')").parent().click();
				},
				remove:function(){
					var rows = $('#trainList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择一个培训！","warning");
					}else{
						//选中员工。弹出确认框
						$.messager.confirm("取消确认","您确定要取消该培训吗？",function(r){
							if(r){
								var ids=[];
								for(var i=0;i<rows.length;i++){
									alert(rows[i].trainid);
									ids.push(rows[i].trainid);
								}
								var idss =ids.join(',');
								//确定，发送请求
								//获取选择的员工id,staff为json对象
								var train = rows[0];//json对象
								$.post("cancelTrain",{"ids":idss}, function(data){
			            			if(data.status == 200){
			            				$.messager.alert('提示','取消成功!',"info",function(){
			            					$("#trainList").datagrid("reload");
			            				});
			            			}
			            		},"json");
							}
						});
					}
				},
				search:function(){
					var tj=$.trim($('input[name="xztj"]').val());
					var trainstatus="";
					var realname="";
					var trainname="";
					if($.trim($('a[group="trainstatus"].l-btn-selected').text())=="全部"){
						trainstatus = null;
					}else{
						trainstatus = $.trim($('a[group="trainstatus"].l-btn-selected').text());
					}
					if(tj=="xm"){
						realname = $.trim($('input[name="searchbytj"]').val());
						trainname = "";
					}else{
						realname = "";
						trainname = $.trim($('input[name="searchbytj"]').val());
					}
					$("#trainList").datagrid("load",{
						realname : realname,
						trainstatus :trainstatus,
						trainname :trainname
					});
				},
				searchall:function(){
					$("#qxbutton").css({visibility:"hidden"});
					$("#trainList").datagrid("load",{
						realname:"",
						trainname:"",
						trainstatus :null
					});
				},
				searchjxz:function(){
					$("#qxbutton").css({visibility:"hidden"});
					$("#trainList").datagrid("load",{
						realname:"",
						trainname:"",
						trainstatus :"进行中"
					});
				},
				searchwks:function(){
					$("#qxbutton").css({visibility:"visible"});
					$("#trainList").datagrid("load",{
						realname:"",
						trainname:"",
						trainstatus :"未开始"
					});
				},
				searchyjs:function(){
					$("#qxbutton").css({visibility:"hidden"});
					$("#trainList").datagrid("load",{
						realname:"",
						trainname:"",
						trainstatus :"已结束"
					});
				},
				searchyqx:function(){
					$("#qxbutton").css({visibility:"hidden"});
					$("#trainList").datagrid("load",{
						realname:"",
						trainname:"",
						trainstatus :"已取消"
					});
				}
		};
		
		$('#trainList').datagrid({
			url:'trainlist',
			title:'培训记录',
			method:'get',
			columns:[[      //可以合并单元格
					{
						field:"trainid",
						title:"编号",
						width:70,//全一百，平分自
						sortable:true,
						checkbox:true
					},
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
						field:"trainname",
						title:"培训课程",
						width:70,//全一百，平分自
						sortable:true
					},
					{
						field:"starttime",
						title:"开始时间",
						width:70,//全一百，平分自
						sortable:true,
						formatter:formatDateboxYMD,
					},
					{
						field:"endtime",
						title:"结束时间",
						width:70,
						sortable:true,
						formatter:formatDateboxYMD,
					},
					{
						field:"trainstatus",
						title:"状态",
						width:80,//全一百，平分自
						sortable:true
					},
					{
						field:"traingrade",
						title:"成绩",
						width:70,//全一百，平分自
						sortable:true,
						editor:"numberbox"
					},
					{
						field:"remark",
						title:"备注",
						width:100,//全一百，平分自
						sortable:true
					}
			]],
			pagination:true,//分页条
			sortName:'staffno',
			sortOrder:"DESC",
			remoteSort:false,
		/* 	onDblClickCell:function(rowIndex, field, value){
				if(objtrain.editRow!=undefined){
					$(this).datagrid('endEdit', objtrain.editRow);
				}
				
				if(objtrain.editRow==undefined){
					$(this).datagrid('beginEdit', rowIndex);
					objtrain.editRow=rowIndex;
				}
			}, */
			/* onAfterEdit:function(rowIndex,rowDate,changes){
				objtrain.editRow=undefined;
			},  */
			onClickCell: onClickCell,  
	        onAfterEdit:onAfterEdit,
			queryParams:{//额外的参数
				trainstatus:"进行中",
				realname:"",
				trainname:""
			},
			striped:true,
			nowrap:true,//是否显示一行
			fitColumns:true,//自适应
			rownumbers:true,//显示行号
			fit:true,
			singleSelect:false,//只能选择一行
			//showHeader:true,
			//showFooter:true,//显示行尾，统计可用 
			toolbar:"#toolbartrain"
		});
	});
</script>

<!-- 员工列表 -->
<table id="trainList"></table>

<!-- 工具栏 -->
<div id="toolbartrain" style="padding:5px;">
	<div>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="objtrain.add();">添加课程</a>
		<a class="easyui-linkbutton" id="qxbutton" data-options="iconCls:'icon-remove',plain:true" onclick="objtrain.remove();" style="visibility:hidden">取消课程</a>
		<!-- 该 span 用于辅助定位-->
		<span style="margin-left:400px"/> </span>
		<select class="easyui-combobox" id="xztj" name="xztj" data-options="required:true,editable:false" panelHeight="auto">
			<option value="xm">姓名</option>
			<option value="kcm">课程名</option>
		</select>
		<input class="easyui-textbox" name="searchbytj">
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="objtrain.search();">查询</a>
		
		<a class="easyui-linkbutton" id="searchbytrainstatus1" onclick="objtrain.searchyqx();" data-options="iconCls:'icon-search',group:'trainstatus',toggle:true" style="float: right;margin-right:50px;">已取消</a>
		<a class="easyui-linkbutton" id="searchbytrainstatus2" onclick="objtrain.searchyjs();" data-options="iconCls:'icon-search',group:'trainstatus',toggle:true" style="float: right;">已结束</a>
		<a class="easyui-linkbutton" id="searchbytrainstatus3" onclick="objtrain.searchwks();" data-options="iconCls:'icon-search',group:'trainstatus',toggle:true" style="float: right;">未开始</a>
		<a class="easyui-linkbutton" id="searchbytrainstatus4" onclick="objtrain.searchjxz();" data-options="iconCls:'icon-search',group:'trainstatus',toggle:true,selected:true" style="float: right;">进行中</a>
		<a class="easyui-linkbutton" id="searchbytrainstatus5" onclick="objtrain.searchall();" data-options="iconCls:'icon-search',group:'trainstatus',toggle:true" style="float: right;">全部</a>
	</div>
</div>
