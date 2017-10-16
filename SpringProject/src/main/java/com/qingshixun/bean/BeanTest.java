package com.qingshixun.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	@Test
	public void testbean1() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1 =(Bean1) context.getBean("bean1");
		System.out.println(bean1);
	}
	
	@Test
	public void testbean2() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 bean2 =(Bean2) context.getBean("bean2");
		System.out.println(bean2);
	}
	
	@Test
	public void testbean3() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 bean3 =(Bean3) context.getBean("bean3");
		System.out.println(bean3);
	}
}
