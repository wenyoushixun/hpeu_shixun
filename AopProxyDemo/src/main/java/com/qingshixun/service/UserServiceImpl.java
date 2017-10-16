/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.service;

public class UserServiceImpl implements IUserService {

    @Override
    public void login(String username) {
        System.out.println(username + "进行了用户登录操作");
    }

    @Override
    public void register() {
        System.out.println("进行了用户注册操作");
    }

}
