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
	public void savetest() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user1 = new User();
		user1.setLoginName("zhangsan");
		user1.setCreateDate(new Date());
		user1.setPassword("123");

		User user2 = new User();
		user2.setLoginName("lisi");
		user2.setCreateDate(new Date());
		user2.setPassword("456");

		Order order = new Order();
		order.setCode("wwww");
		order.setCreateDate(new Date());

		Order order1 = new Order();
		order1.setCode("eee");
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode("rrr");
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode("ttt");
		order3.setCreateDate(new Date());

		user1.getOrders().add(order);
		user1.getOrders().add(order1);

		user2.getOrders().add(order2);
		user2.getOrders().add(order3);

		session.save(user1);
		session.save(user2);

		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void selecttest() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		User user = (User) session.get(User.class, 1);
		User user1 = (User) session.get(User.class, 2);
		System.out.println(user);
		System.out.println(user1);

		session.getTransaction().commit();
		session.close();
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
		order.setCode("sdf");

		session.save(order);
		System.out.println(order);

		session.getTransaction().commit();
		session.close();
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

		session.getTransaction().commit();
		session.close();
	}
}
