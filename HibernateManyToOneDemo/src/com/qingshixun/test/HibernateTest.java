package com.qingshixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.qingshixun.model.Order;
import com.qingshixun.model.Status;

public class HibernateTest {
	
	@Test
	public void savetest(){
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Status status1 = new Status();
		status1.setCreateDate(new Date());
		status1.setStatusName("未付款");
		Status status2 = new Status();
		status2.setCreateDate(new Date());
		status2.setStatusName("已付款");
		
		
		Order order = new Order();
		order.setCode("111");
		order.setCreateDate(new Date());
		
		Order order1 = new Order();
		order1.setCode("222");
		order1.setCreateDate(new Date());
		
		
		order.setStatuse(status1);
		order1.setStatuse(status2);
//		status1.getOrders().add(order);
//		status1.getOrders().add(order1);
		
		session.save(order);
		session.save(order1);
		
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void selecttest(){
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Order order = (Order)session.get(Order.class, 1);
		Order order2 = (Order)session.get(Order.class, 2);
		System.out.println(order);		
		System.out.println(order2);		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void updatetest(){
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Order order = (Order)session.get(Order.class, 1);
		order.setCode("sdfsdf");
		session.save(order);
		System.out.println(order);
//		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
//		commodity.setName("手机");
//		
//		session.save(commodity);
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void deletetest(){
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Order order = (Order)session.get(Order.class, 1);
		session.delete(order);
//		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
//		session.delete(commodity);
//		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
