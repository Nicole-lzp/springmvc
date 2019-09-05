package cn.com.git.service.impl;

import java.util.List;

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
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	public void addUser(User user) {
		userDao.addUser(user.getUsername(), user.getPassword());
	}
	
	public int editUser(User user) {
		return userDao.editUser(user.getUsername(), user.getPassword());
	}
	
	public int delUser(String username) {
		return userDao.delUser(username);
	}

}
