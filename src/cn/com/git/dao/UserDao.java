package cn.com.git.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.git.model.User;

public interface UserDao {

	/**
	 * �����û���������
	 * @return
	 */
	public User findByName(String username);
	
	/**
	 * ��ѯ�����û�
	 */
	public List<User> findAll();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * ����û�
	 */
	public void addUser(@Param("username") String username,@Param("password")String password);
	
	/**
	 * �޸��û�
	 */
	int editUser(String username,String password);
	
	/**
	 * ɾ���û�
	 */
	int delUser(String username);
}
