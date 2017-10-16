/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.model;

/**
 * Model 表示数据模型，也就是俗称的实体类
 * 
 * 只包含属性和对应的 get、set 方法（还会有一些辅助的方法），不能包含业务（功能）代码
 */
public class User {

	// 用户名
	private String username;

	// 密码
	private String password;

	// 重复密码
	private String repeatPassword;

	// 邮箱
	private String email;

	// 性别
	private String gender;

	// 职业
	private String profession;

	// 爱好
	private String hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
