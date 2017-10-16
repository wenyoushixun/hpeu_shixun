package com.shixun.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userDao2")
public class UserDao2 implements IUserDao {

	@Value("李四")
	String name;
	
	@Override
	public void save() {
		System.out.println("userDao2");
	}

	@Override
	public String toString() {
		return "UserDao2 [name=" + name + "]";
	}

}
