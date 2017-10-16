/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.service;

import java.sql.SQLException;

import com.shixun.online.dao.UserDao.JdbcUse;
import com.shixun.online.model.User;

/**
 * 写用户相关的逻辑（功能）代码
 */
public class UserService {

	JdbcUse dao = new JdbcUse();

	public int login(User user) {

		User dbuser = dao.query(user.getUsername(), user.getPassword());

		if (dbuser != null) {
			if (user.getUsername().equals(dbuser.getUsername()) && user.getPassword().equals(dbuser.getPassword())) {
				return 1;
			} else {
				return -2;
			}
		} else {
			return -1;
		}
	}

	public boolean index(User user) throws SQLException {

		User dbuser = dao.selecter(user.getUsername());
		if (dbuser == null) {
			dbuser = dao.insert(user);
			return true;
		}
		return false;
	}

	
}
