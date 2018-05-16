<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="toolbar-payroll" style="padding:5px;">
	<form id="staffTreeForm">
		年月：<input id="attYearMonth" editable="false" name="attYearMonth" class="easyui-datebox"  style="width: 150px" />
		<span style="margin-left:15px">员工：</span> <input id="staffTree" name="staffTree">
		<a class="easyui-linkbutton"  onclick="addPayroll();">发放薪资</a>
		<a class="easyui-linkbutton"  onclick="objpy.searchbyexample();">查询薪资</a>
	</form>
</div>
<!-- 工资单列表 -->
<table id="payrollList"></table>

<script>
function getPayroll(){
	$.post("${pageContext.request.contextPath}/payrollList",$("#staffTreeForm").serialize(), function(data){
		objpy.searchbyexample(data);
	},"json");
}

function addPayroll(){
	var stafflist=$("#staffTree").combotree("tree").tree("getChecked");
	var getValues=$("#staffTree").combotree("getValues");
	//alert(getValues);
	var time=$.trim($('input[name="attYearMonth"]').val());
	if(time==""||time==null){
		$.messager.alert('提示','请选择月份!',"warning");
		return;
	}
	if(stafflist.length==0){
		$.messager.alert('提示','请选择员工!',"warning");
		return;
	}
	var stafflistStr = [];
	var stafflistNo = [];
	var stafflistJson = null;
	var stafflistJson2;
	var stafflistJson1 = "{'id':1,'id':2}";
	//获取id数组转成json
	if(stafflist.length>0){
		for(var i=0;i<stafflist.length;i++){
			if(stafflist[i].pId!=0){
				//stafflistStr.push({"id":stafflist[i].id});
				//stafflistStr.push("{'id':"+stafflist[i].id+"}");
				//stafflistStr.push(stafflist[i].id);
				//stafflistJson2 =stafflistJson2 + '{"id":'+stafflist[i].id+'},';
				if(stafflist[i].paygrade!=null&&stafflist[i].paygrade!=""){
					stafflistStr.push(stafflist[i].text);
				}else{
					stafflistNo.push(stafflist[i].text);
				}
			}
		}
		//stafflistJson2=stafflistStr.toString();
		//stafflistJson2=stafflistStr.join(',');
		//stafflistStr=stafflistStr.substr(0, stafflistStr.length - 1);
		//stafflistJson = JSON.stringify(stafflistStr);
		//stafflistJson = JSON.stringify(stafflistJson2);
	}
	if(stafflistNo.length>0){
		$.messager.confirm("工资发放警告","以下员工未工资定级，是否继续为其他员工发放工资？<br/><br/>"+stafflistNo,function(r){
			if(r){
				if(stafflistStr.length>0){
					$.messager.confirm("工资发放确认","您确定要为以下员工发放工资吗？<br/><br/>"+stafflistStr,function(r){
						if(r){
							$.post("${pageContext.request.contextPath}/addPayroll",$("#staffTreeForm").serialize(), function(data){
								objpy.search(time);
								/* if(data.status == 200){
									$.messager.alert('提示','员工录入成功!',"info");
									clearForm();
								}else{
									$.messager.alert('提示','员工录入失败!',"error");
								} */
							},"json");
						}
					});
				}else{
					$.messager.alert('工资发放错误','没有选择已定级员工!',"error");
				}
			}
		});
	}else{
		$.messager.confirm("工资发放确认","您确定要为以下员工发放工资吗？<br/><br/>"+stafflistStr,function(r){
			if(r){
				$.post("${pageContext.request.contextPath}/addPayroll",$("#staffTreeForm").serialize(), function(data){
					objpy.search(time);
					/* if(data.status == 200){
						$.messager.alert('提示','员工录入成功!',"info");
						clearForm();
					}else{
						$.messager.alert('提示','员工录入失败!',"error");
					} */
				},"json");
			}
		});
	}
	//alert(stafflistStr);
	//var obj = stafflistJson1.parseJSON();
		//alert(stafflistStr);
		//alert($("#staffTree").serialize());
	//var obj =  eval('(' + stafflistJson2 + ')');
	//console.log(t.tree("getChecked"));
}
$(function() {
	objpy = {
			search:function(time){
				$("#payrollList").datagrid("load",{
					attYearMonth:time
				});
			},
			searchbyexample:function(data){
				var time=$.trim($('input[name="attYearMonth"]').val());
				var stafflist=$("#staffTree").combotree("tree").tree("getChecked");
				var ids=[];
				if(stafflist.length>0){
					for(var i=0;i<stafflist.length;i++){
						if(stafflist[i].pId!=0){
							ids.push(stafflist[i].id);
						}
					}
				}
				//$("#payrollList").datagrid("loadData",data);
				$("#payrollList").datagrid("load",{
					attYearMonth:time,
					staffTree:ids
				});
			}
	};
	
	
	$('#payrollList').datagrid({
		url:'payrollList',
		title:'列表',
		method:'get',
		columns:[[
				{
					field:"staffno",
					title:"员工编号",
					width:50,
					sortable:true
				},
				{
					field:"realname",
					title:"姓名",
					width:50,
					sortable:true
				},
				{
					field:"position",
					title:"职位",
					width:50,
					sortable:true
				},
				{
					field:"paygrade",
					title:"基本等级",
					width:50,
					sortable:true
				},
				{
					field:"pay",
					title:"基本工资",
					width:50,
					sortable:true
				},
				{
					field:"allowance",
					title:"补贴",
					width:50,
					sortable:true
				},
				{
					field:"bonus",
					title:"奖金",
					width:50,
					sortable:true
				},
				{
					field:"overtime",
					title:"加班费",
					width:50,
					sortable:true
				},
				{
					field:"attendance",
					title:"考勤应扣",
					width:50,
					sortable:true
				},
				{
					field:"medicalins",
					title:"代扣医疗保险",
					width:50,
					sortable:true
				},
				{
					field:"endowmentins",
					title:"代扣养老保险",
					width:50,
					sortable:true
				},
				{
					field:"unemploymentins",
					title:"代扣失业保险",
					width:50,
					sortable:true
				},
				{
					field:"housingfund",
					title:"住房公积金",
					width:50,
					sortable:true
				},
				{
					field:"incometax",
					title:"个人所得税",
					width:50,
					sortable:true
				},
				{
					field:"tsalary",
					title:"应发工资",
					width:50,
					sortable:true
				},
				{
					field:"fsalary",
					title:"实发工资",
					width:50,
					sortable:true
				},
				{
					field:"paytime",
					title:"月份",
					width:50,
					sortable:true,
					formatter:formatDateboxYM
				},
				{
					field:"payway",
					title:"发放方式",
					width:50,
					sortable:true
				},
				{
					field:"paystatus",
					title:"状态",
					width:50,
					sortable:true
				}]],
				pagination:true,//分页条
				//queryParams:{//额外的参数
					//attYearMonth:""
				//},
				striped:true,
				remoteSort:false,
				nowrap:true,//是否显示一行
				fitColumns:true,//自适应
				rownumbers:true,//显示行号
				singleSelect:true,//只能选择一行
				//showHeader:true,
				//showFooter:true,//显示行尾，统计可用 
				toolbar:"#toolbar-payroll"
	});
	
	
	
	
	
	$("#staffTree").combotree({
		url:"getDepartmentTreeNode",
		method:"get",
		multiple:true,
		lines:true,
		//onlyLeafCheck:true,
		onLoadSuccess:function(node,data){
			if(data){//当有值时
				$(data).each(function(index,value){
					if(this.state == 'closed') {
						//$("#staffTree").combotree({url:"getDepartmentTreeNode?id="+this.id});
						//$("#staffTree").combotree('tree').tree('expand',value.target);
						//$("#staffTree").combotree('tree').tree('collapse',this.target);
						$("#staffTree").combotree('tree').tree('expandAll');
						//$("#staffTree").combotree('tree').tree('collapseAll');
					}
				});
				//$(data).each(function(index,value){
					//console.log(value);
						//$("#staffTree").combotree('tree').tree('expandAll');
						//$("#staffTree").combotree('tree').tree('collapseAll');
						//$("#staffTree").combotree('tree').tree('collapse',this.target);
						//$("#staffTree").combotree('tree').tree('onCollapse');
				//});
			}
		}
		/*  onSelect:function(data){
			$("#staffTree").combotree('tree').tree('append',{
				parent: data.target, 
				loader:function(data){
					$.post("getDepartmentTreeNode",{"id":data.id}, function(data){
						alert(data);
            		},"json");
				}
		}); */
	//}
	
	});	
	
   $('#attYearMonth').datebox({
       //显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层
       onShowPanel: function () {
          //触发click事件弹出月份层
          span.trigger('click'); 
          if (!tds)
            //延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔
            setTimeout(function() { 
                tds = p.find('div.calendar-menu-month-inner td');
                tds.click(function(e) {
                   //禁止冒泡执行easyui给月份绑定的事件
                   e.stopPropagation(); 
                   //得到年份
                   var year = /\d{4}/.exec(span.html())[0] ,
                   //月份
                   //之前是这样的month = parseInt($(this).attr('abbr'), 10) + 1; 
                   month = parseInt($(this).attr('abbr'), 10);  

         //隐藏日期对象                     
         $('#attYearMonth').datebox('hidePanel') 
           //设置日期的值
           .datebox('setValue', year + '-' + month); 
                        });
                    }, 0);
            },
            //配置parser，返回选择的日期
            parser: function (s) {
                if (!s) return new Date();
                var arr = s.split('-');
                return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1);
            },
            //配置formatter，只返回年月 之前是这样的d.getFullYear() + '-' +(d.getMonth()); 
            formatter: function (d) { 
                var currentMonth = (d.getMonth()+1);
                var currentMonthStr = currentMonth < 10 ? ('0' + currentMonth) : (currentMonth + '');
                return d.getFullYear() + '-' + currentMonthStr; 
            }
        });

        //日期选择对象
        var p = $('#attYearMonth').datebox('panel'), 
        //日期选择对象中月份
        tds = false, 
        //显示月份层的触发控件
        span = p.find('span.calendar-text'); 
        var curr_time = new Date();

        //设置前当月
        $("#attYearMonth").datebox("setValue", myformatter(curr_time));
});
	
//格式化日期
function myformatter(date) {
    //获取年份
    var y = date.getFullYear();
    //获取月份
    var m = date.getMonth() + 1;
    return y + '-' + m;
}
</script>