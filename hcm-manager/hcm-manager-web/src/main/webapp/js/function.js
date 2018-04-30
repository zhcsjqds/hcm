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