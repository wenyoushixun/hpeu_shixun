package com.qingshixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.qingshixun.model.Order;
import com.qingshixun.model.User;

public class HibernateTest {

	@Test
	public void saveUserAndOrders() {

		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user1 = new User();
		user1.setLoginName("张三");
		user1.setPassword("123");
		user1.setCreateDate(new Date());
		User user2 = new User();
		user2.setLoginName("李四");
		user2.setPassword("456");
		user2.setCreateDate(new Date());
		User user3 = new User();
		user3.setLoginName("王五");
		user3.setPassword("789");
		user3.setCreateDate(new Date());

		Order order = new Order();
		order.setCode("111");
		order.setCreateDate(new Date());

		Order order1 = new Order();
		order1.setCode("222");
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode("333");
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode("444");
		order3.setCreateDate(new Date());
		
		Order order4 = new Order();
		order4.setCode("555");
		order4.setCreateDate(new Date());
		
		Order order5 = new Order();
		order5.setCode("666");
		order5.setCreateDate(new Date());

		user1.getOrders().add(order);
		user1.getOrders().add(order1);
		user2.getOrders().add(order2);
		user2.getOrders().add(order3);
		user3.getOrders().add(order4);
		user3.getOrders().add(order5);
		
		order.setUser(user1);
		order1.setUser(user1);
		order2.setUser(user2);
		order3.setUser(user2);
		order4.setUser(user3);
		order5.setUser(user3);

		session.save(user1);
		session.save(user2);
		session.save(user3);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void getUserAndOrders() {
		
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user = (User)session.get(User.class, 1);
		User user1 = (User)session.get(User.class, 2);
		User user2 = (User)session.get(User.class, 3);
		
		Order order = (Order) session.get(Order.class, 1);
//		Order order2 = (Order) session.get(Order.class, 2);
//		Order order3 = (Order) session.get(Order.class, 3);
		System.out.println(user);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(order);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void saveOrdersAndUser() {

		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user1 = new User();
		user1.setLoginName("张三");
		user1.setPassword("123");
		user1.setCreateDate(new Date());
		User user2 = new User();
		user2.setLoginName("李四");
		user2.setPassword("456");
		user2.setCreateDate(new Date());
		User user3 = new User();
		user3.setLoginName("王五");
		user3.setPassword("789");
		user3.setCreateDate(new Date());

		Order order = new Order();
		order.setCode("111");
		order.setCreateDate(new Date());

		Order order1 = new Order();
		order1.setCode("222");
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode("333");
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode("444");
		order3.setCreateDate(new Date());
		
		Order order4 = new Order();
		order4.setCode("555");
		order4.setCreateDate(new Date());
		
		Order order5 = new Order();
		order5.setCode("666");
		order5.setCreateDate(new Date());

		user1.getOrders().add(order);
		user1.getOrders().add(order1);
		user2.getOrders().add(order2);
		user2.getOrders().add(order3);
		user3.getOrders().add(order4);
		user3.getOrders().add(order5);
		
		order.setUser(user1);
		order1.setUser(user1);
		order2.setUser(user2);
		order3.setUser(user2);
		order4.setUser(user3);
		order5.setUser(user3);

//		session.save(user1);
//		session.save(user2);
//		session.save(user3);
		session.save(order);
		session.save(order2);
		session.save(order4);
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void getOrdersAndUser() {
		
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

//		User user = (User)session.get(User.class, 1);
//		User user1 = (User)session.get(User.class, 2);
//		User user2 = (User)session.get(User.class, 3);
		Order order = (Order) session.get(Order.class, 1);
		Order order1 = (Order) session.get(Order.class, 2);
		Order order2 = (Order) session.get(Order.class, 3);
		Order order3 = (Order) session.get(Order.class, 4);
		Order order4 = (Order) session.get(Order.class, 5);
		Order order5 = (Order) session.get(Order.class, 6);
		System.out.println(order);
		System.out.println(order1);
		System.out.println(order2);
		System.out.println(order3);
		System.out.println(order4);
		System.out.println(order5);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void updatetest() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Order order = (Order) session.get(Order.class, 1);
		order.setCode("sdfsdf");
		session.save(order);
		// Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		// commodity.setName("手机");
		//
		// session.save(commodity);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void deletetest() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Order order = (Order) session.get(Order.class, 1);
		session.delete(order);
		// Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		// session.delete(commodity);
		//
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
