package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.DepartmentMapper;
import cn.zouhuachao.pojo.Department;
import cn.zouhuachao.pojo.DepartmentExample;
import cn.zouhuachao.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> getDepartment() {
		DepartmentExample example = new DepartmentExample();
		List<Department> list = departmentMapper.selectByExample(example);
		return list;
	}

	/**
	 * 根据id查找部门
	 */
	@Override
	public Department findDepartmentById(String departmentid) {
		Department department = departmentMapper.selectByPrimaryKey(departmentid);
		return department;
	}

	/**
	 * 根据id查找部门名
	 */
	@Override
	public String getDepartmentNameById(String departmentid) {
		Department department = departmentMapper.selectByPrimaryKey(departmentid);
		String departmentname = department.getDepartmentname();
		return departmentname;
	}
	
}
