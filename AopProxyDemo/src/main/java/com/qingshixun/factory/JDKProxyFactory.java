/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 的代理方式
 */
public class JDKProxyFactory implements InvocationHandler {

    // 目标对象，使用 Object 类型更为通用
    private Object target;

    /**
     * 构造方法，在实例化的时候要给 target 赋值
     * @param target 被代理的目标对象
     */
    public JDKProxyFactory(Object target) {
        super();
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object createProxy() {
        // 第一个参数：目标对象的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 第二个参数：目标对象实现的接口数组
        Class<?>[] interfaces = target.getClass().getInterfaces();

        // 第三个对象：实现了InvocationHandler接口的对象
        // 使用Proxy.newProxyInstance创建代理对象
        return Proxy.newProxyInstance(classLoader, interfaces, this);

    }

    /**
     * 在代理的实例上处理方法的执行并返回结果
     * 第一个参数：代理对象，不常使用
     * 第二个参数：执行的方法对象
     * 第三个参数：执行方法所需的参数数组
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 进行功能的增强
        System.out.println("记录日志");

        // 执行目标方法并返回执行的结果
        return method.invoke(target, args);
    }

}
