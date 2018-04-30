package cn.zouhuachao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/{url}")
	public String showPage(@PathVariable String url) {
		return url;
	}
	
	@RequestMapping("/changePassword")
	public String changePassword() {
		return "changePassword";
	}
}
