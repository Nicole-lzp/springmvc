package cn.com.git.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.git.model.User;

public interface UserDao {

	/**
	 * 查找用户名和密码
	 * @return
	 */
	public User findByName(String username);
	
	/**
	 * 查询所有用户
	 */
	public List<User> findAll();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 添加用户
	 */
	public void addUser(@Param("username") String username,@Param("password")String password);
	
	/**
	 * 修改用户
	 */
	int editUser(String username,String password);
	
	/**
	 * 删除用户
	 */
	int delUser(String username);
}
