<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script>
	$(function(){
		obj = {
				add:function(){
					$(".tree-title:contains('员工录入')").parent().click();
				},
				edit:function(){
					var rows = $('#staffList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择需要修改的员工！","warning");
					}else{
						$("#staffEditWindow").css({visibility:"visible"});
						var staff = rows[0];//json对象
						$("#staffEditWindow").window({
							title:"修改员工信息",
							width:450,
							top:160,
							left:730,
							modal:true,
							shadow:true,
							height:620,
							resizable:false,
							cache : false
						}).window("open");
						$("#staffEditForm").form("load",staff);
					}
				},
				transfer:function(){
					var rows = $('#staffList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择需要修改的员工！","warning");
					}else{
						$("#staffTransferWindow").css({visibility:"visible"});
						var staff = rows[0];//json对象
						$("#staffTransferWindow").window({
							title:"员工调职处理",
							width:360,
							top:250,
							left:750,
							modal:true,
							shadow:true,
							height:300,
							resizable:true,
							cache : false
						}).window("open");
						$('#staffTransferForm').form('clear');
						$("#staffTransferForm").form("load",staff);
					}
				},
				remove:function(){
					var rows = $('#staffList').datagrid("getSelections");
					if(rows.length==0){
						//没有选中记录，提示
						$.messager.alert("提示信息","请选择一名员工！","warning");
					}else{
						//选中员工。弹出确认框
						$.messager.confirm("解雇确认","您确定要解雇该员工吗？",function(r){
							if(r){
								//确定，发送请求
								//获取选择的员工id,staff为json对象
								var staff = rows[0];//json对象
								var staffno = staff.staffno;
								$.post("fireStaff",staff, function(data){
			            			if(data.status == 200){
			            				$.messager.alert('提示','解雇成功!',"info",function(){
			            					$("#staffList").datagrid("reload");
			            				});
			            			}
			            		},"json");
							}
						});
					}
				},
				search:function(){
					var statu="";
					if($.trim($('a[group="status"].l-btn-selected').text())=="全部"){
						statu = null;
					}else{
						statu = $.trim($('a[group="status"].l-btn-selected').text());
					}
					$("#staffList").datagrid("load",{
						realname : $.trim($('input[name="searchbyname"]').val()),
						status :statu
					});
				},
				searchall:function(){
					$("#staffList").datagrid("load",{
						realname:"",
						status :null
					});
				},
				searchzz:function(){
					$("#staffList").datagrid("load",{
						realname:"",
						status :"在职"
					});
				},
				searchlz:function(){
					$("#staffList").datagrid("load",{
						realname:"",
						status :"离职"
					});
				}
		};
		
		
		
		
		$('#staffList').datagrid({
			url:'stafflist',
			title:'员工列表',
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
						field:"phone",
						title:"手机号码",
						width:100,//全一百，平分自
						sortable:true
					},
					{
						field:"email",
						title:"邮箱",
						width:110,//全一百，平分自
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
						sortable:true,
						//formatter:formatDatebox
					},
					{
						field:"workage",
						title:"工龄",
						width:80,//全一百，平分自
						sortable:true
					},
					{
						field:"address",
						title:"地址",
						width:100,//全一百，平分自
						sortable:true
					},
					{
						field:"bankcard",
						title:"银行账户",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"title",
						title:"职称",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"maritalstatus",
						title:"婚姻状况",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"identityid",
						title:"身份证号",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"birthday",
						title:"生日日期",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"politicsstatus",
						title:"政治面貌",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"bloodtype",
						title:"血型",
						width:100,//全一百，平分自
						hidden:true
					},
					{
						field:"nation",
						title:"民族",
						width:100,//全一百，平分自
						hidden:true
					}
			]],
			pagination:true,//分页条
			sortName:'staffno',
			sortOrder:"DESC",
			remoteSort:false,
			onDblClickRow : doDblClickRow,
			queryParams:{//额外的参数
				status:"在职",
				realname:""
			},
			striped:true,
			fit:true,
			nowrap:true,//是否显示一行
			fitColumns:true,//自适应
			rownumbers:true,//显示行号
			singleSelect:true,//只能选择一行
			//showHeader:true,
			//showFooter:true,//显示行尾，统计可用 
			toolbar:"#toolbar"
				/* [
				{text:"添加",iconCls:'icon-add',
					handler:function(){
						$(".tree-title:contains('员工录入')").parent().click();
					}
				},
				{text:"修改",iconCls:'icon-edit',
					handler:function(){
						var rows = $('#staffList').datagrid("getSelections");
						if(rows.length==0){
							//没有选中记录，提示
							$.messager.alert("提示信息","请选择需要修改的员工！","warning");
						}else{
							$("#staffEditWindow").css({visibility:"visible"});
							var staff = rows[0];//json对象
							$("#staffEditWindow").window({
								title:"修改员工信息",
								width:450,
								top:160,
								left:730,
								modal:true,
								shadow:true,
								height:620,
								resizable:false,
								cache : false
							}).window("open");
							//$('#staffEditForm').form('clear');
							$("#staffEditForm").form("load",staff);
						}
					}
				},
				{text:"解雇",iconCls:'icon-remove',
					handler:function(){
						var rows = $('#staffList').datagrid("getSelections");
						if(rows.length==0){
							//没有选中记录，提示
							$.messager.alert("提示信息","请选择一名员工！","warning");
						}else{
							//选中员工。弹出确认框
							$.messager.confirm("解雇确认","您确定要解雇该员工吗？",function(r){
								if(r){
									//确定，发送请求
									//获取选择的员工id,staff为json对象
									var staff = rows[0];//json对象
									var staffno = staff.staffno;
									$.post("fireStaff",{"staffno":staffno}, function(data){
				            			if(data.status == 200){
				            				$.messager.alert('提示','解雇成功!',"info",function(){
				            					$("#staffList").datagrid("reload");
				            				});
				            			}
				            		},"json");
								}
							});
						}
					}	
				},
				{text:"查询",iconCls:'icon-search',
					handler:function(){
						alert(1);
					}	
				}
			] */
		});
	});
	
	//提交表单
	function submitEditForm(){
		//有效性验证
		if(!$('#staffEditForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		//$("#staffEditForm").serialize()将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/staffEdit",$("#staffEditForm").serialize(), function(data){
			if(data.status == 200){
				//刷新页面
				obj.searchzz();
				$.messager.alert('提示','员工修改成功!',"info");
				//关闭窗口
				$("#staffEditWindow").window({}).window("closed");
			}else{
				$.messager.alert('提示','员工修改失败!',"error");
			}
		},"json");
	}
	
	function clearEditForm(){
		$('#staffEditForm').form('reset');
	}
	
	//提交表单
	function submitTransferForm(){
		//有效性验证
		if(!$('#staffTransferForm').form('validate')){
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
		$('#staffTransferWindow').window({}).window('closed');
	}
</script>

<!-- 员工列表 -->
<table id="staffList"></table>

<!-- 工具栏 -->
<div id="toolbar" style="padding:5px;">
	<div>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="obj.add();">添加</a>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" onclick="obj.edit();">修改</a>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="obj.transfer();">调职</a>
		<a class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="obj.remove();">解雇</a>
		<span style="margin-left:400px;">姓名：</span><input class="easyui-textbox" name="searchbyname">
		<!-- <input id="departmentid1" name="depatementid" /> -->
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="obj.search();">查询</a>
		
		<a class="easyui-linkbutton" id="searchbystatus1" onclick="obj.searchlz();" data-options="iconCls:'icon-search',group:'status',toggle:true" style="float: right;margin-right:50px;">离职</a>
		<a class="easyui-linkbutton" id="searchbystatus2" onclick="obj.searchzz();" data-options="iconCls:'icon-search',group:'status',toggle:true,selected:true" style="float: right;">在职</a>
		<a class="easyui-linkbutton" id="searchbystatus3" onclick="obj.searchall();" data-options="iconCls:'icon-search',group:'status',toggle:true" style="float: right;">全部</a>
	</div>
</div>

<!-- 员工详细信息窗口 -->
<div class="easyui-window" id="staffInfoWindow"  data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="staffInfoForm" >
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

<!-- 员工编辑修改窗口 -->
<div id="staffEditWindow" class="easyui-window" data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="staffEditForm">
		<table cellpadding="5">
	        <tr>
	            <td>姓名:</td>
	            <td><input class="easyui-textbox" type="text" name="realname" data-options="required:true"></input></td>
	        </tr>
	        <tr>
	            <td>性别:</td>
	            <td>
		            <select class="easyui-combobox" name="gender" data-options="required:true,editable:false" panelHeight="auto" style="width:50px">
		            	<option></option>
		            	<option value="男">男</option>
		            	<option value="女">女</option>
		            </select>
	            </td>
	        </tr>
	        <!-- <tr>
	            <td>年龄:</td>
	            <td><input class="easyui-numberbox" type="text" name="age" data-options="min:1,max:99999999,precision:2,required:true" />
	            	<input type="hidden" name="price"/>
	            </td>
	        </tr> -->
	        <tr>
	            <td>学历:</td>
	            <td>
	            	<select class="easyui-combobox" name="education" data-options="required:true,editable:false" panelHeight="auto">
		            	<option value="">请选择</option>
		            	<option value="小学">小学</option>
		            	<option value="初中">初中</option>
		            	<option value="高中">高中</option>
		            	<option value="中专">中专</option>
		            	<option value="大专">大专</option>
		            	<option value="大学">大学</option>
		            	<option value="硕士">硕士</option>
		            	<option value="博士">博士</option>
		            </select>
	            </td>
	        </tr>
	   <%--      <tr>
	            <td>籍贯:</td>
	            <td>
					 	<select id="s_province" name="province" class="textbox" style="width:141px"></select>
  						<select id="s_city" name="city" class="textbox" style="width:141px"></select> 
  						<script src="${pageContext.request.contextPath}/js/city.js" type="text/javascript"></script>
  						<script type="text/javascript">_init_area();</script>
	            </td>
	        </tr> --%>
	        <tr>
	            <td>民族:</td>
	            <td>
	                <input id="nationid" name="nation"/>
	                <script type="text/javascript">
	                	$(function(){
	                		$("#nationid").combobox({
	                			valueField:'name',
	                			textField:'name',
	                			url:'${pageContext.request.contextPath}/json/nation.json',
	                			method:"get",
	                			//value:"汉族",
	                			required:true,
	                			editable:false
	                		});
	                	});
	                </script>
	            </td>
	        </tr>
	        <tr>
	            <td>血型:</td>
	            <td>
	                <select class="easyui-combobox" name="bloodtype" data-options="required:true,editable:false" panelHeight="auto">
		            	<option value="">请选择</option>
		            	<option value="O型">O型</option>
		            	<option value="A型">A型</option>
		            	<option value="B型">B型</option>
		            	<option value="AB型">AB型</option>
		            </select>
	            </td>
	        </tr>
	        <tr>
	            <td>政治面貌:</td>
	            <td>
	            	<select class="easyui-combobox" name="politicsstatus" data-options="required:true" panelHeight="auto">
		            	<option value="">请选择</option>
		            	<option value="中共党员">中共党员</option>
		            	<option value="共青团员">共青团员</option>
		            	<option value="群众">群众</option>
		            </select>
	            </td>
	        </tr>
	        <tr>
	            <td>出生日期:</td>
	            <td>
	            	<input  id="datebox" name="birthday" />
	            	<script type="text/javascript">
	                	$(function(){
	                		$('#datebox').datebox({
	                			required:true,
	                			editable:false
	                		});
	                		 $('#datebox').datebox('calendar').calendar({
							    validator: function(date){
							        var now = new Date();
							        var nowdate = new Date(now.getFullYear(), now.getMonth(), now.getDate());
							        return nowdate>=date;
							    }
							}); 
	                	});
	                </script>
	            </td>
	        </tr>
	        <tr>
	            <td>入职日期:</td>
	            <td>
	            	<input  id="datebox" name="entrydate" class="easyui-datebox" data-options="required:true,editable:false"/>
	            </td>
	        </tr>
	        <tr>
	            <td>身份证号:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="identityid" data-options="validType:'idcared',required:true" />
	            	<script type="text/javascript">
		            	var aCity={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",
		            			34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",
		            			52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"}   
	            	  
		            	function isCardID(sId){   
		            	    var iSum=0 ;  
		            	    var info="" ;  
		            	    if(!/^\d{17}(\d|x)$/i.test(sId)) return "你输入的身份证长度或格式错误";   
		            	    sId=sId.replace(/x$/i,"a");   
		            	    if(aCity[parseInt(sId.substr(0,2))]==null) return "你的身份证地区非法";   
		            	    sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2));   
		            	    var d=new Date(sBirthday.replace(/-/g,"/")) ;  
		            	    if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return "身份证上的出生日期非法";   
		            	    for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;  
		            	    if(iSum%11!=1) return "你输入的身份证号非法";   
		            	    return true;//aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女")   
		            	}
	                	$(function(){
	                		$.extend($.fn.validatebox.defaults.rules,{
	                			idcard: {// 验证身份证
	                                validator: function (value) {
	                                    return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
	                                },
	                                message: '身份证号码格式不正确!'
	                            },
	                            idcared: {     
	                                validator: function(value,param){    
	                                    var flag= isCardID(value);  
	                                    return flag==true?true:false;    
	                                },     
	                                message: '不是有效的身份证号码'    
	                            }
	                		});
	                	});
	                </script>
	            </td>
	        </tr>
	        <tr>
	            <td>婚姻状况:</td>
	            <td>
	            	<select class="easyui-combobox" name="maritalstatus" data-options="required:true,editable:false" panelHeight="auto" style="width:80px">
		            	<option></option>
		            	<option value="已婚">已婚</option>
		            	<option value="未婚">未婚</option>
		            </select>
	            </td>
	        </tr>
	        <tr>
	            <td>联系电话:</td>
	            <td>
	                <input class="easyui-validatebox textbox" type="text" name="phone" data-options="validType:'phone',required:true" />
	            	<script type="text/javascript">
	                	$(function(){
	                		$.extend($.fn.validatebox.defaults.rules,{
	                			phone:{
	                				validator:function(value,param){
	                					var reg=/^1[3|4|5|8|9]\d{9}$/;
	                					return reg.test(value);
	                				},
	                				message:'请输入正确的手机号码。'
	                			}
	                		});
	                	});
	                </script>
	            </td>
	        </tr>
	        <tr>
	            <td>电子邮箱:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="email" data-options="validType:'email',required:true" />
	            </td>
	        </tr>
	        <!-- <tr>
	            <td>状态:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="status" data-options="validType:'length[1,30]'" />
	            </td>
	        </tr> -->
	        <tr>
	            <td>银行卡号:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="bankcard" data-options="validType:'length[1,30]'" />
	            </td>
	        </tr>
	        <tr>
	            <td>联系地址:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="address" data-options="required:true,multiline:true" style="width:200px;height:50px"/>
	            </td>
	        </tr>
	        <!-- <tr>
	            <td>职称:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="title" data-options="validType:'length[1,30]'" />
	            </td>
	        </tr> -->
	    </table>
	    <input type="hidden" name="staffid">
	</form>
	<div style="padding:5px;margin-left:50px;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitEditForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearEditForm()">重置</a>
	</div>
</div>

<!-- 员工调职窗口 -->
<div id="staffTransferWindow" class="easyui-window" data-options="closed:true" style="padding:20px;visibility:hidden">
	<form id="staffTransferForm">
		<table cellpadding="5">
			<tbody>
	        	<tr>
					<td>原部门：</td>
					<td>
						<input name="department" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
					<td>原职位：</td>
					<td>
						<input name="position" style="border:0px;disabled:true" readonly>
					</td>
				</tr>
				<tr>
		            <td>新部门:</td>
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
				                                valueField:'positionid',  
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
		            	</script>
		            </td>
		        </tr>
		        <tr>
		        	<td>新职位</td>
		        	<td>
		        		 <input id="positionid" name="newpositionid"/>
		        	</td>
		        </tr>
		        <tr>
		        	<td>说明：</td>
		        	<td>
		        		 <input class="easyui-textbox" name="transreason" data-options="multiline:true" style="width:200px;height:50px"/>
		        	</td>
		        </tr>
			</tbody>
	    </table>
	    <input type="hidden" name="staffid">
	    <!-- <input type="hidden" name="positionid">
	    <input type="hidden" name="departmentid"> -->
	</form>
	<div style="padding:5px;margin-left:50px;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitTransferForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeTransferWindow()">取消</a>
	</div>
</div>