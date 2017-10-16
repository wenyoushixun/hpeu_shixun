/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.action;

import com.shixun.online.model.User;
import com.shixun.online.service.UserService;

/**
 * 在 action 中，只做数据的传递和页面的跳转
 */
public class UserAction {

    // 用户业务处理类
    UserService service = new UserService();

    private User user;

    private String message;

    /**
     * 用户登录
     * @return
     */
    public String login() {
        // 使用 ServletActionContext 可以获取到相关域对象
        // ServletActionContext.getRequest().getSession();

        if (service.login(user)) {
            return "success";
        }

        return "fail";
    }

    /**
     * 增加用户
     */
    public String addUser() {
        message = "用户添加失败";
        if (service.addUser(user)) {
            message = "用户添加成功";
        }
        return "success";

    }

    /**
     * 删除用户
     */
    public String deleteUser() {
        service.deleteUser();
        return "success";
    }

    /**
     * 修改用户
     */
    public String updateUser() {
        service.updateUser();
        return "success";
    }

    /**
     * 查询用户
     */
    public String findUser() {
        service.findUser();
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
