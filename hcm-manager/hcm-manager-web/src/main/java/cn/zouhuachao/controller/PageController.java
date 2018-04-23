package cn.zouhuachao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/changePassword")
	public String changePassword() {
		return "changePassword";
	}
}
