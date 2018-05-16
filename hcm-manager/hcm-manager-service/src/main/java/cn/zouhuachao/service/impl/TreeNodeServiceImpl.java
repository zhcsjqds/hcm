package cn.zouhuachao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.common.pojo.EasyUITreeNode;
import cn.zouhuachao.mapper.DepartmentMapper;
import cn.zouhuachao.mapper.StaffMapper;
import cn.zouhuachao.pojo.Department;
import cn.zouhuachao.pojo.DepartmentExample;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffExample;
import cn.zouhuachao.service.ITreeNodeService;

@Service
public class TreeNodeServiceImpl implements ITreeNodeService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private StaffMapper staffMapper;
	
	/**
	 * 获取部门节点列表	
	 */
	@Override
	public List<EasyUITreeNode> getDepartmentTreeNode(String id) {
		if(id==null) {
			DepartmentExample example = new DepartmentExample();
			List<Department> departmentList = departmentMapper.selectByExample(example);
			List<EasyUITreeNode> list = new ArrayList<EasyUITreeNode>();
			for (Department department : departmentList) {
				EasyUITreeNode treeNode = new EasyUITreeNode();
				treeNode.setId(department.getDepartmentid());
				treeNode.setText(department.getDepartmentname());
				treeNode.setState("closed");
				treeNode.setpId("0");
				list.add(treeNode);
			}
			return list;
		} else {
			StaffExample example = new StaffExample();
			example.createCriteria().andDepartmentidEqualTo(id);
			List<Staff> staffList = staffMapper.selectByExample(example);
			List<EasyUITreeNode> list = new ArrayList<EasyUITreeNode>();
			for (Staff staff : staffList) {
				EasyUITreeNode childrenNode = new EasyUITreeNode();
				childrenNode.setId(staff.getStaffid());
				childrenNode.setText(staff.getRealname());
				childrenNode.setState("open");
				childrenNode.setpId(id);
				childrenNode.setPaygrade(staff.getPaygrade());
				list.add(childrenNode);
			}
			return list;
		}
	}
}
