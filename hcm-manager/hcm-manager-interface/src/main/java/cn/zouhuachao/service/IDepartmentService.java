package cn.zouhuachao.service;

import java.util.List;

import cn.zouhuachao.pojo.Department;

public interface IDepartmentService {

	List<Department> getDepartment();

	Department findDepartmentById(String departmentid);
	
	String getDepartmentNameById(String departmentid);
}
