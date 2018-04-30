package cn.zouhuachao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
	@RequestMapping("/test")
	public String addStaff() {
		
		return "datagird";
	}
	@RequestMapping("/test1")
	public String addStaff1() {
		
		return "staff-list2";
	}
}
