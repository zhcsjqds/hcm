package cn.zouhuachao.service.impl;

import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.UserMapper;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.User;
import cn.zouhuachao.pojo.UserExample;

import cn.zouhuachao.service.IUserService;
import cn.zouhuachao.utils.CommonsUtils;
import cn.zouhuachao.utils.Encrypt;
import cn.zouhuachao.utils.RandomStringUtil;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
	@Override
	public User login(String username, String password) {
		UserExample userExample = new UserExample();
		//加密密码
		String psw = Encrypt.md5(password, username);
		//设置查询条件
		userExample.createCriteria().andPasswordEqualTo(psw).andUsernameEqualTo(username);
		List<User> userList = userMapper.selectByExample(userExample);
		if(userList!=null&&userList.size()>0) {
			User user = userList.get(0);
			return user;
		}
		return null;
	}

	@Override
	public boolean updatePassword(String oldpassword, String username, String newpassword) {
		UserExample userExample = new UserExample();
		//加密密码
		String psw = Encrypt.md5(oldpassword, username);
		//设置查询条件
		userExample.createCriteria().andPasswordEqualTo(psw).andUsernameEqualTo(username);
		List<User> user = userMapper.selectByExample(userExample);
		if(user != null && user.size()>0) {
			String newpsw = Encrypt.md5(newpassword, username);
			userExample.createCriteria().andUsernameEqualTo(username);
			User u = new User();
			u.setPassword(newpsw);
			int isOK = userMapper.updateByExampleSelective(u, userExample);
			if(isOK>0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * 自动生成账号
	 */
	@Override
	public boolean autoAddUser(Staff staff, String roleid) {
		User user = new User();
		user.setUserid(CommonsUtils.getUUID());
		user.setUsername(staff.getStaffno());
		String password = RandomStringUtil.getRandomString(4);
		user.setPassword(Encrypt.md5(password,staff.getStaffno()));
		user.setRoleid(roleid);
		user.setLocked((byte) 0);
		user.setCreatedate(new Date());
		user.setStaffid(staff.getStaffid());
		int insert = userMapper.insert(user);
		//如果添加账号成功，发送电子邮件给员工
		if(insert>0) {
			//spring集成javamail(发送邮件费时，给新线程处理)
			Thread th = new Thread(new Runnable() {
				public void run() {
					String gender = staff.getGender();
					String genderStr=null;
					if(gender=="女") {
						genderStr="女士";
					} else if(gender=="男") {
						genderStr="先生";
					}
					try {
						MimeMessage message = mailSender.createMimeMessage();
						//为了更好的操作MimeMessage对象，借用一个工具类来操作它
						MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");
						//通过工具类设置主题，内容，图片，附件
						helper.setFrom("zouhuachaode@163.com");
						helper.setTo(staff.getEmail());//收件箱
						helper.setSubject("新员工入职系统账号通知");
						helper.setText("<html>\r\n" + 
								"<head><title>Hello</title></head>\r\n" + 
								"<body>\r\n" + 
								"<table id=\"middle_column_inner_table\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">																<tbody><tr>\r\n" + 
								"	  <td>                                         \r\n" + 
								"		<table id=\"middle_column_content_table\" style=\"background:#ffffff; -webkit-border-radius:8px; -moz-border-radius:8px; border-radius:8px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"40\" border=\"0\"><tbody><tr><td id=\"middle_column_content_cell\" style=\"background-color:#ffffff;-webkit-border-radius:6px; -moz-border-radius:6px; border-radius:6px;-webkit-box-shadow:0 1px 3px rgba(0,0,0, 0.2);-moz-box-shadow:0 1px 3px rgba(0,0,0, 0.2);box-shadow:0 1px 3px rgba(0,0,0, 0.2);\">\r\n" + 
								"		<span style=\"font-family:'Helvetica Neue', Helvetica, Arial, sans-serif;font-size:16px; line-height:22px; color:#424242;\">                                         \r\n" + 
								"			<p style=\"margin:0 0 30px 0;\">您好 "
								+ staff.getRealname()+genderStr+"！欢迎您加入本公司，您的员工编号为:"+staff.getStaffno()+"</p>\r\n" 
								+ "<p style=\\\"margin:0 0 30px 0;\\\">您可以点击下面链接进入本公司的管理系统，账号为员工编号，初始密码为："+password+"</p>"+
								"\r\n" + 
								"				<a style=\"display:inline-block; width:100%; background-color:#eaf3ff; text-decoration:none; color:#5486c6; font-size:18px; font-weight:bold; text-align:center;  padding:15px 0px 15px 0px; -webkit-border-radius:2px; -moz-border-radius:2px; border-radius:2px\" href=\"http://localhost:8080/hcm-manager-web\" target=\"_blank\">点击进入！</a>\r\n" + 
								"\r\n" + 
								"			<p style=\"margin:30px 0 0 0;\">--某某公司。</p>                                                        \r\n" + 
								"         </span>\r\n" + 
								"		</td></tr>\r\n" + 
								"</tbody></table>\r\n" + 
								"</body>\r\n" + 
								"</html>",true);
						mailSender.send(message);
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			th.start();
		}
		return insert>0?true:false;
	}
}
