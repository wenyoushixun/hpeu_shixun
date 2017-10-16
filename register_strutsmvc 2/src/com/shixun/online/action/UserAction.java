package com.shixun.online.action;

import java.sql.SQLException;

import com.shixun.online.model.User;
import com.shixun.online.service.UserService;

public class UserAction {

	private User user;

	private String message;
	
	private String messages;

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	UserService ser = new UserService();

	public String login() {
		if (ser.login(user) == 1) {
			return "success";
		} else if (ser.login(user) == -1) {
			message = "用户名不存在";
			return "fail";
		}else{
			message = "密码错误";
			return "fail";
		}	
			
		
	}

	public String index() throws SQLException {
		if(ser.index(user)==true){
			messages = "注册成功！";
			return "success";
			
		}
		messages = "用户名也存在，请换其它用户注册！";
		return "fail";	
	}

}
