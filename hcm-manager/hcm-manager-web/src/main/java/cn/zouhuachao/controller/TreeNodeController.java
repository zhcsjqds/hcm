package cn.zouhuachao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUITreeNode;
import cn.zouhuachao.service.ITreeNodeService;

@Controller
public class TreeNodeController {
	
	@Autowired
	private ITreeNodeService treeNodeService;
	
	@RequestMapping("/getDepartmentTreeNode")
	@ResponseBody
	public List<EasyUITreeNode> getDepartmentTreeNode(String id){
		List<EasyUITreeNode> list = treeNodeService.getDepartmentTreeNode(id);
		return list;
	}
}
