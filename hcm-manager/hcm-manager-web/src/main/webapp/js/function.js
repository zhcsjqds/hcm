function changePassword() {
	var content = '<div style="width:100%;height:100%;overflow:hidden;">'
			+ '<iframe src="changePassword" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';
	var e = $("#mytabs").tabs("exists", "修改密码");
	if (e) {
		$("#mytabs").tabs("select", "修改密码");
	} else {
		$("#mytabs").tabs("add", {
			title : "修改密码",
			closable : true,
			content : content
		});
	}
}

function logout() {
	location.href = "logout";
}

function staffinfo(staffid){
	var content = '<div style="width:100%;height:100%;overflow:hidden;">'
		+ '<iframe src="staffinfo" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';
	var e = $("#mytabs").tabs("exists", "个人信息");
	if (e) {
	$("#mytabs").tabs("select", "个人信息");
	} else {
	$("#mytabs").tabs("add", {
		title : "个人信息",
		closable : true,
		content : content
	});
}
}

function doDblClickRow(rowIndex, rowData) {
	$("#staffInfoWindow").css({visibility:"visible"});
	var rows = $('#staffList').datagrid("getSelections");
	var staff = rows[0];// json对象
	$("#staffInfoWindow").window({
		title : "员工详细信息",
		width : 350,
		top : 220,
		left : 800,
		modal : true,
		shadow : true,
		close : false,
		height : 530,
		resizable : false,
		collapsible : false,
		minimizable : false,
		maximizable : false,
		cache : false
	}).window("open");
	$('#staffInfoForm').form('clear');
	$("#staffInfoForm").form("load", staff);
}

function doDblClickRowTochange(rowIndex, rowData) {
	var rows = $('#trainList').datagrid("getSelections");
	var train = rows[0];// json对象
	
}

/*
$.extend($.fn.datagrid.methods, {
	editCell: function(jq,param){
		return jq.each(function(){
			var opts = $(this).datagrid('options');
			var fields = $(this).datagrid('getColumnFields',true).concat($(this).datagrid('getColumnFields'));
			for(var i=0; i<fields.length; i++){
				var col = $(this).datagrid('getColumnOption', fields[i]);
				col.editor1 = col.editor;
				if (fields[i] != param.field){
					col.editor = null;
				}
			}
			$(this).datagrid('beginEdit', param.index);
			for(var i=0; i<fields.length; i++){
				var col = $(this).datagrid('getColumnOption', fields[i]);
				col.editor = col.editor1;
			}
		});
	}
});

 单元格可编辑   
var tab='#trainList';  
var editIndex = undefined;  
function endEditing() {// 该方法用于关闭上一个焦点的editing状态  
      
    if (editIndex == undefined) {  
        return true  
    }  
    if ($(tab).datagrid('validateRow', editIndex)) {  
        $(tab).datagrid('endEdit', editIndex);  
        editIndex = undefined;  
        return true;  
    } else {  
        return false;  
    }  
      
};  
*//**单击事件*//*  
function singleClink() {  
    endEditing();  
}  
  
*//** 双击编辑 *//*  
function DbclkCommentCell(index, field, value) {  
    if (endEditing()) {  
        $(tab).datagrid('selectRow', index).datagrid('editCell', {index:index,field:field});  
        editIndex = index;  
    }  
};  
// 单元格失去焦点执行的方法  
function onAfterEdit(index, row, changes) {  
    var updated = $(tab).datagrid('getChanges', 'updated');  
    if (updated.length < 1) {  
        editRow = undefined;  
        $(tab).datagrid('unselectAll');  
        return;  
    } else {  
        $(tab).datagrid('acceptChanges');  
        // 传值,可做在线编辑功能  
        submitForm(index, row, changes);  
    }  
};

*/
var editIndex = undefined;  
function endEditing() {//该方法用于关闭上一个焦点的editing状态  
    if (editIndex == undefined) {  
        return true  
    }  
    if ($('#trainList').datagrid('validateRow', editIndex)) {  
        $('#trainList').datagrid('endEdit', editIndex);  
        editIndex = undefined;  
        return true;  
    } else {  
        return false;  
    }  
}  
//点击单元格事件：  
function onClickCell(rowIndex,field,value) {  
	var rows = $('#trainList').datagrid('getRows');
	var row = rows[rowIndex];
	var trainstatus = row.trainstatus;
    if (endEditing()) {
        if(field=="traingrade"){
        	if(trainstatus!="已结束"){
        		$.messager.alert('提醒', '该培训未结束，不能录入成绩！',"info");
        		$('#trainList').datagrid('unselectAll');
        		return;
        	}
            $(this).datagrid('beginEdit', rowIndex);  
            //var ed = $(this).datagrid('getEditor', {rowIndex:rowIndex,field:field});  
           // $(ed.target).focus();  
        }         
        editIndex = rowIndex;  
    }  
    $('#trainList').datagrid('onClickRow')  
}  
//单元格失去焦点执行的方法  
function onAfterEdit(rowIndex, row, changes) {  
    var updated = $('#trainList').datagrid('getChanges', 'updated');  
    if (updated.length < 1) {  
        editRow = undefined;  
        $('#trainList').datagrid('unselectAll');  
        return;  
    } else {  
        // 传值  
        submitTraingradeForm(rowIndex, row, changes);  
    }  
}  


//提交数据  
function submitTraingradeForm(rowIndex, row, changes) {
	var trainid = row.trainid;
	//var traingrade = row.traingrade;
    var finalRusult=changes.traingrade;//期末成绩  
    $.ajax({  
            type : "get",  
            async : false,  
            url : "updateTraingrade",  
            data : {  
                "trainid" : trainid,  
                "traingrade" : finalRusult  
               // "totalResult":totalRusult  
            },
            success : function(data) {
                if(data==true){  
                    $("#trainList").datagrid('reload');  
                }  
            }  
        })  
}  