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

function logout(){
	location.href="logout";
}