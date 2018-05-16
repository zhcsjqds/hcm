package cn.zouhuachao.service;

import java.util.List;

import cn.zouhuachao.common.pojo.EasyUITreeNode;

public interface ITreeNodeService {

	List<EasyUITreeNode> getDepartmentTreeNode(String id);

}
