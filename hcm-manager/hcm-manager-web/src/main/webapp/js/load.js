$(function() {
	$("#navtree").tree({
		lines : true,
		method : "get",
		url : 'json/navtree.json',
		onClick : function(node) {
			if ($('#navtree').tree("isLeaf", node.target)) {
				var tabs = $("#mytabs");
				var tab = tabs.tabs("exists", node.text);
				if (tab) {
					tabs.tabs("select", node.text);
				} else {
					tabs.tabs('add', {
						title : node.text,
						href : node.url,
						closable : true,
						bodyCls : "content"
					});
				}
			}
		}
	});

	$("#select1").combobox({
		valueFiled:'p',
		textField:'p',
		url:'json/city1.json'
	});
});
