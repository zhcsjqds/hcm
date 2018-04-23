package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.UserMapper;
import cn.zouhuachao.pojo.User;
import cn.zouhuachao.pojo.UserExample;

import cn.zouhuachao.service.IUserService;
import cn.zouhuachao.utils.Encrypt;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
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
}
