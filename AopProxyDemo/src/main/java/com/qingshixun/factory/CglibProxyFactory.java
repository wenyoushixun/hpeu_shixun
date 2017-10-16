/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.qingshixun.factory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib 的代理方式
 */
public class CglibProxyFactory implements MethodInterceptor {

    // 目标对象，使用 Object 类型更为通用
    private Object target;

    /**
     * 构造方法，在实例化的时候要给 target 赋值
     * @param target 被代理的目标对象
     */
    public CglibProxyFactory(Object target) {
        super();
        this.target = target;
    }

    // 创建代理对象
    public Object createProxy() {
        // 1.创建Enhancer
        Enhancer enhance = new Enhancer();

        // 2.传递目标对象的Class
        enhance.setSuperclass(target.getClass());

        // 3.设置回调操作 (相当于InvocationHandler)
        enhance.setCallback(this);

        return enhance.create();
    }

    // 相当于InvocationHandler中的invoke
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methdoProxy) throws Throwable {
        System.out.println("日志操作....");
        return method.invoke(target, args); // 与jdk的proxy中操作类似
        // return methdoProxy.invokeSuper(proxy, args);
    }
}
