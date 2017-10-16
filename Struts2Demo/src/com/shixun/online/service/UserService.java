/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.service;

import com.shixun.online.dao.UserDao;
import com.shixun.online.model.User;

/**
 * 写用户相关的逻辑（功能）代码
 */
public class UserService {

    UserDao dao = new UserDao();

    /**
     * 用户登录
     * @return
     */
    public boolean login(User user) {
        User dbUser = dao.getUser();
        if (dbUser.getUsername().equals(user.getUsername()) && dbUser.getPassword().equals(user.getPassword())) {
            return true;
        }
        return false;

    }

    /**
     * 增加用户
     */
    public boolean addUser(User user) {
        if (dao.addUser(user) != 0) {
            return true;
        }
        return false;
    }

    /**
     * 删除用户
     */
    public void deleteUser() {
        dao.deleteUser();
    }

    /**
     * 修改用户
     */
    public void updateUser() {
        dao.updateUser();
    }

    /**
     * 查询用户
     */
    public void findUser() {
        dao.findUser();
    }

}
