package cn.zouhuachao.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.zouhuachao.mapper.UserMapper;
import cn.zouhuachao.pojo.User;
import cn.zouhuachao.pojo.UserExample;
import cn.zouhuachao.service.IUserService;

public class HcmRealm extends AuthorizingRealm{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	//授权方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	//认证方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		//获取页面输入的用户名
		String username = usernamePasswordToken.getUsername();
		//根据用户名查询数据库中的密码
		User user = userService.findPasswordByUsername(username);
		if(user==null) {
			//页面输入的用户名不存在
			return null;
		}
		//框架负责比对数据库中的密码和用户输入的密码是否一致
		//简单认证信息对象
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		return info;//返回null，认证失败，抛出未知账号异常
	}

}
