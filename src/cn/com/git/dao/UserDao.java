package cn.com.git.dao;

import org.apache.ibatis.annotations.Param;

import cn.com.git.model.User;

public interface UserDao {

	/**
	 * �����û���������
	 * @param username
	 * @return
	 */
	public User findByName(String username);
	
	public void regist(@Param("username") String username,@Param("password")String password);
}
