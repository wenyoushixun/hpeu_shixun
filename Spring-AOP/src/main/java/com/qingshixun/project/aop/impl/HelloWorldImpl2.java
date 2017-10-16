package com.qingshixun.project.aop.impl;

import com.qingshixun.project.aop.HelloWorld;

public class HelloWorldImpl2 implements HelloWorld {

	@Override
	public void printHelloWorld() {
		System.out.println("I'm Zhangsan,say hello to the world ！");
		
	}

	@Override
	public void doPrint() {
		System.out.println("English！");
		System.out.println(1 / 0);
		
	}

}
