/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qingshixun.model.User;

@RunWith(SpringJUnit4ClassRunner.class) // spring 整合 JUnit4
@ContextConfiguration(locations = "classpath:applicationContext.xml") // 指定 spring 配置文件的位置
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testSave() {
        User user = new User();
        user.setPassword("123123");
        user.setUsername("李四");
        userService.save(user);
    }

}
