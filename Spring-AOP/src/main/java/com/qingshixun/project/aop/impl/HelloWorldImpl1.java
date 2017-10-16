package com.qingshixun.project.aop.impl;

import com.qingshixun.project.aop.HelloWorld;

public class HelloWorldImpl1 implements HelloWorld {

	@Override
	public void printHelloWorld() {
		System.out.println("我是张三，向世界问好！");

	}

	@Override
	public void doPrint() {
		System.out.println("中文");
	}

}
