package cn.com.git.service;

import java.util.List;

import cn.com.git.model.User;

public interface IUserService {

	public User findByName(String username,String password);
	public void addUser(User user);
	
	//查询所有用户
	public List<User> findAll();
	//修改用户
	public int editUser(User user);
	//删除用户
	public int delUser(String username);
}
