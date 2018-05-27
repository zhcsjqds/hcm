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

	$("#navtree2").tree({
		lines : true,
		method : "get",
		url : 'json/navtree2.json',
		onClick : function(node) {
			if ($('#navtree2').tree("isLeaf", node.target)) {
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
	
	$("#navtree3").tree({
		lines : true,
		method : "get",
		url : 'json/navtree3.json',
		onClick : function(node) {
			if ($('#navtree3').tree("isLeaf", node.target)) {
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
	
});
