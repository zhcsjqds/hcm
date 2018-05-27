<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:10px 10px 10px 10px">
	<form id="staffAddForm"  method="post">
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
	        <tr>
	            <td>籍贯:</td>
	            <td>
					 	<select id="s_province" name="province" class="textbox" style="width:141px"></select>
  						<select id="s_city" name="city" class="textbox" style="width:141px"></select> 
  						<script src="${pageContext.request.contextPath}/js/city.js" type="text/javascript"></script>
  						<script type="text/javascript">_init_area();</script>
	            </td>
	        </tr>
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
	            <td>职位:</td>
	            <td>
	                <input id="departmentid" name="departmentid"/>
	                <input id="positionid" name="positionid"/>
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
	        <!-- <tr>
	            <td>部门:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="department_id" data-options="validType:'length[1,30]'" />
	            </td>
	        </tr> -->
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
		            	<option value="其他">其他</option>
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
	   <!--  <input type="hidden" name="itemParams"/> -->
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#staffAddForm').form('validate')){
			$.messager.alert('提示','请按要求填写完成!',"warning");
			return ;
		}
		//ajax的post方式提交表单
		//$("#staffAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("${pageContext.request.contextPath}/staffAdd",$("#staffAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','员工录入成功!',"info");
				clearForm();
			}else{
				$.messager.alert('提示','员工录入失败!',"error");
			}
		},"json");
	}
	
	function clearForm(){
		$('#staffAddForm').form('reset');
	}
</script>
