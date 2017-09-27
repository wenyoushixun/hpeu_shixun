package com.shixun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.shixun.service.RegisterService;

@Component
public class SpringIoCTest {

	@SuppressWarnings("resource")
	@Test
	public void test() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		RegisterService registerService = (RegisterService) context.getBean("registerService");
		registerService.doRegister();
	}
}
