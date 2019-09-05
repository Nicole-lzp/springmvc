package cn.com.git.dao;

import org.apache.ibatis.annotations.Param;

import cn.com.git.model.User;

public interface UserDao {

	/**
	 * 查找用户名和密码
	 * @param username
	 * @return
	 */
	public User findByName(String username);
	
	public void regist(@Param("username") String username,@Param("password")String password);
}
