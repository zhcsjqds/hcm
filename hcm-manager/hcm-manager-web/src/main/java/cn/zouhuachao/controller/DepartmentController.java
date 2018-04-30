package cn.zouhuachao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.pojo.Department;
import cn.zouhuachao.service.IDepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private IDepartmentService service;
	
	/**
	 * 根据部门列表
	 * @return
	 */
	@RequestMapping("/findDepartmentList")
	@ResponseBody
	public List<Department> findDepartment(){
		List<Department> list = service.getDepartment();
		return list;
	}
	
	/**
	 * 根据ID查询部门
	 * @return
	 */
	public Department findDepartmentById(String departmentid) {
		Department department = service.findDepartmentById(departmentid);
		return department;
	}
}
