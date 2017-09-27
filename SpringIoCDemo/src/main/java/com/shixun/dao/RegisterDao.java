package com.shixun.dao;

import org.springframework.stereotype.Repository;

@Repository("registerDao")
public class RegisterDao {

	public void save(){
		System.out.println("用户信息已保存");
	} 
}
