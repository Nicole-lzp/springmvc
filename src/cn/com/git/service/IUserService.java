package cn.com.git.service;

import cn.com.git.model.User;

public interface IUserService {

	public User findByName(String username,String password);
	public void regist(User user);
}
