package cn.com.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.git.model.User;
import cn.com.git.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	
	//��������loginҳ��
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/checkLogin")
	public String checkLogin(User user,Model model) {
		user = userService.findByName(user.getUsername(),user.getPassword());
		//����User����ӵ�model�ﲢ����ת���ɹ�ҳ��
		if(user != null) {
			model.addAttribute("username",user.getUsername());
			return "mainpage";
//			List<User> userList = userService.findAll();
//			model.addAttribute("userList",userList);
//			return "allUser";
		}
		return "fail";
	}
	
	//��ת��ע��ҳ��
	@RequestMapping("/regist")
	public String regist() {
		return "regist";
	}
	
	@RequestMapping("/doRegist")
	public String doRegist(User user,Model model) {
		System.out.println(user.getUsername());
		model.addAttribute("user",user.getUsername());
		userService.addUser(user);
		return "success";
	}
	
	/**
	 * ��ȡ�����û��б�
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<User> user = userService.findAll();
		model.addAttribute("userList",user);
		return "allUser";
	}
	
	@RequestMapping("/editUser")
	public String editUser(User user,Model model) {
		userService.editUser(user);
		return null;
	}
	
	@RequestMapping("/delUser")
	public String delUser(String username) {
		userService.delUser(username);
		return null;
	}
	
	
	
	
	
}
