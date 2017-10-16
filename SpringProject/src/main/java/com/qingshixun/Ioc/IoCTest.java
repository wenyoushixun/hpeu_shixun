package com.qingshixun.Ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IoCTest {

	@Test
	public void test() {

		User user = new User();
		user.setName("wenyou");
		user.setAge("18");
		System.out.println(user);
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User bean =(User) context.getBean("user");
		System.out.println(bean);
	}
	
}
