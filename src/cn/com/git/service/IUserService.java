package cn.com.git.service;

import java.util.List;

import cn.com.git.model.User;

public interface IUserService {

	public User findByName(String username,String password);
	public void addUser(User user);
	
	//��ѯ�����û�
	public List<User> findAll();
	//�޸��û�
	public int editUser(User user);
	//ɾ���û�
	public int delUser(String username);
}
