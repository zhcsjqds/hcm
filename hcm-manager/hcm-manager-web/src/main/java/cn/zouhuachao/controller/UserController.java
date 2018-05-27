package cn.zouhuachao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.zouhuachao.pojo.User;

import cn.zouhuachao.service.IUserService;
import cn.zouhuachao.utils.Encrypt;

@Controller
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	@RequestMapping("/login1")
	public String login1() {
		return "login";
	}
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param checkcode
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(String username,String password,String checkcode,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		//获取验证码
		String attribute = (String) session.getAttribute("key");
		//校验验证码
		if(attribute!=null&&attribute.equals(checkcode)) {
			//使用shiro框架提供的方式进行认证操作
			Subject subject = SecurityUtils.getSubject();//获取当前用户对象，状态为“未认证”
			String psw = Encrypt.md5(password, username);
			AuthenticationToken token = new UsernamePasswordToken(username,psw);//创建用户名密码令牌对象
			try{
				subject.login(token);//无返回值，可以根据不抛异常判断是否成功
			}catch (Exception e) {
				e.printStackTrace();
				mv.addObject("errorUser", "账号或者密码错误！");
				mv.setViewName("login");
				return mv;
			}
			User user = (User) subject.getPrincipal();
			String realname = userService.findRealnameByUser(user);
			session.setAttribute("user", user);
			session.setAttribute("realname", realname);
			mv.setViewName("index");
			return mv;
		} else {
			mv.addObject("errorCheckcode", "验证码输入有误！");
			mv.setViewName("login");
			return mv;
		}
	}
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param checkcode
	 * @param session
	 * @return
	 */
	@RequestMapping("/login2")
	public ModelAndView login2(String username,String password,String checkcode,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		//获取验证码
		String attribute = (String) session.getAttribute("key");
		//校验验证码
		if(attribute!=null&&attribute.equals(checkcode)) {
			User user = userService.login(username,password);
			if(user != null) {
				session.setAttribute("user", user);
				mv.setViewName("index");
				return mv;
			} else {
				mv.addObject("errorUser", "账号或者密码错误！");
				mv.setViewName("login");
				return mv;
			}
		} else {
			mv.addObject("errorCheckcode", "验证码输入有误！");
			mv.setViewName("login");
			return mv;
		}
	}
	

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "login";
	}
	
	/**
	 * 修改密码
	 * @param request
	 * @param session
	 */
	@RequestMapping("/updatePassword")	
	public void updatePassword(HttpServletRequest request,HttpSession session,HttpServletResponse response) {
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		
		String oldpassword = (String) request.getParameter("oldpassword");
		String newpassword = (String) request.getParameter("newpassword");
		boolean isok = userService.updatePassword(oldpassword,username,newpassword);
		if(isok) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
