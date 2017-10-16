package com.shixun.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao implements IUserDao {

	@Value("张三")
	String name;
	
	@Override
	public void save() {		
		System.out.println("你保存了UserDao");
	}

	@Override
	public String toString() {
		return "UserDao [name=" + name + "]";
	}

	
}
