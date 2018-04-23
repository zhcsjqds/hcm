package cn.zouhuachao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zouhuachao.service.IStaffService;

@Controller
public class StaffController {

	@Autowired
	private IStaffService staffService;
	
	@RequestMapping("/staffList")
	public String staffList() {
		staffService.findAllStaff();
		return "staff-list";
	}
}
