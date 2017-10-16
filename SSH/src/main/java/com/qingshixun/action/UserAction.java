/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qingshixun.model.User;
import com.qingshixun.service.UserService;

@Controller("userAction")
public class UserAction {

    @Autowired
    private UserService userService;

    private User user;

    /**
     * 保存
     */
    public String save() {
        userService.save(user);
        return "success";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
