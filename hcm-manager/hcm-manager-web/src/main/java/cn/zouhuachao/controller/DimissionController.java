package cn.zouhuachao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.service.IStaffDimissionService;

@Controller
public class DimissionController {
	
	@Autowired
	private IStaffDimissionService dimissionService;
	
	@RequestMapping("/dimissionList")
	@ResponseBody
	public EasyUIDataGirdResult dimissionList(Integer page, Integer rows,String realname) {
		EasyUIDataGirdResult dimissionList = dimissionService.getDimissionList(page, rows, realname);
		return dimissionList;
	}
}
