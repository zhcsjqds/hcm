package cn.zouhuachao.service;

import cn.zouhuachao.pojo.User;

public interface IUserService {

	User login(String username, String password);

	boolean updatePassword(String oldpassword, String username, String newpassword);

}
