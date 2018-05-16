package cn.zouhuachao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.pojo.StaffPosition;
import cn.zouhuachao.service.IStaffPositionService;

@Controller
public class StaffPositionController {

	@Autowired
	private IStaffPositionService staffPositionService;
	
	
	@RequestMapping("/findPositionList")
	@ResponseBody
	public List<StaffPosition> findPosition(String departmentid) {
		List<StaffPosition> list = staffPositionService.getPosition(departmentid);
		return list;
	}
	
	@RequestMapping("/findAllPositionList")
	@ResponseBody
	public List<StaffPosition> findAllPosition() {
		List<StaffPosition> list = staffPositionService.getAllPosition();
		return list;
	}
}
