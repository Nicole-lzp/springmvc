package cn.com.git.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.git.dao.UserDao;
import cn.com.git.model.User;
import cn.com.git.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 检验用户登录业务
	 * @param username
	 * @return
	 */
	public User findByName(String username,String password) {
		User user = userDao.findByName(username);
		if(user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
	
	public void regist(User user) {
		userDao.regist(user.getUsername(), user.getPassword());
	}

}
