package com.qingshixun.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

	@Test
	public void testdog1() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dog dog1 =(Dog) context.getBean("dog1");
		System.out.println(dog1); 
	}
	
	@Test
	public void testdog2() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dog dog2 =(Dog) context.getBean("dog2");
		System.out.println(dog2); 
	}
	
	@Test
	public void testPerson() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person =(Person) context.getBean("person");
		System.out.println(person); 
	}
	
}
