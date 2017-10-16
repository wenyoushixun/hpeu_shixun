/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.test;

import org.junit.Test;

import com.qingshixun.factory.CglibProxyFactory;
import com.qingshixun.factory.JDKProxyFactory;
import com.qingshixun.service.IUserService;
import com.qingshixun.service.MemberService;
import com.qingshixun.service.UserServiceImpl;

public class ProxyTest {

    @Test
    public void test() {
        // 创建对象
        IUserService userService = new UserServiceImpl();

        // 调用方法
        userService.login("hello");
        userService.register();

    }

    /**
     * 测试 jdk 代理
     */
    @Test
    public void test1() {
        // 创建目标对象
        IUserService userService = new UserServiceImpl();

        // 通过 JDKProxyFactory 得到目标的代理对象
        JDKProxyFactory jdkProxyFactory = new JDKProxyFactory(userService);
        IUserService userServiceProxy = (IUserService) jdkProxyFactory.createProxy();

        // 使用代理对象调用目标方法
        userServiceProxy.login("张三");
        userServiceProxy.register();

    }

    /**
     * 测试 cglib 代理
     */
    @Test
    public void test2() {
        // 创建目标对象
        MemberService memberService = new MemberService();

        // 使用CglibProxyFactory创建代理对象
        CglibProxyFactory factory = new CglibProxyFactory(memberService);
        MemberService memberServiceProxy = (MemberService) factory.createProxy();

        // 使用代理对象调用目标方法
        memberServiceProxy.login("李四");
        memberServiceProxy.register();

    }

}
