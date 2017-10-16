package com.qingshixun.gather;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	
	@Test
	public void testlist() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean) context.getBean("collectionBean");
		System.out.println(bean.getList()); 
	}
	
	@Test
	public void testset() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean) context.getBean("collectionBean");
		System.out.println(bean.getSet()); 
	}
	
	@Test
	public void testmap() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean) context.getBean("collectionBean");
		System.out.println(bean.getMap()); 
	}
	
	@Test
	public void testprops() {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean) context.getBean("collectionBean");
		System.out.println(bean.getProps()); 
	}
	
	@Test
	public void testbean() {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean) context.getBean("collectionBean");
		System.out.println(bean); 
	}
}
