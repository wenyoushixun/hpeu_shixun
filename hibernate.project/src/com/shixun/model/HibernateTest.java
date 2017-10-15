package com.shixun.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {

	public static void main(String[] args) {
		testSelect();

	}

	public static void testSelect() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// 单个输出

		User user = (User) session.get(User.class, 1);
		System.out.println(user);
		System.out.println("----分割线------");

		// 多行输出
		// List<User> list = session.createQuery("from User").list();
		// for (User user2 : list) {
		// System.out.println(user2);
		// }

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void testAdd() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		// session.beginTransaction();

		// 自己的代码
		// User user = (User) session.get(User.class, 1);
		// System.out.println(user);
		// System.out.println("----分割线------");
		// try {
		User user = (User) session.get(User.class, 1);
		user.setUsername("西梅");
		user.setAddress("asasd");
		user.setBalance(1);
		session.save(user);

		// System.out.println(10/0);
		//
		// user.setUsername("啊hong");
		// user.setAddress("遵义");
		// session.save(user);
		session.getTransaction().commit();

		// } catch (Exception e) {
		// session.getTransaction().rollback();
		// }

		// 多行输出
		// List<User> list = session.createQuery("from User").list();
		// for (User user2 : list) {
		// System.out.println(user2);
		// }

		session.close();
		sessionFactory.close();
	}

	@Test
	public void testupdate() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// 自己的代码
		// User user = (User) session.get(User.class, 1);
		// System.out.println(user);
		// System.out.println("----分割线------");
		User user = (User) session.get(User.class, 1);
//		user.setUsername("111");
//		user.setAddress("111");
		user.setBalance(333);
		session.save(user);
		// 多行输出
		// List<User> list = session.createQuery("from User").list();
		// for (User user2 : list) {
		// System.out.println(user2);
		// }

//		session.getTransaction().commit();
		session.flush();
		session.close();
		sessionFactory.close();
	}

	public static void testSelectAll() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// 自己的代码
		// User user = (User) session.get(User.class, 1);
		// System.out.println(user);
		// System.out.println("----分割线------");
		// User user = (User) session.get(User.class, 1);
		// user.setUsername("问偶");
		// user.setAddress("是的噶");
		// session.save(user);
		// 多行输出
		@SuppressWarnings("unchecked")
		List<User> list = session.createQuery("from User").list();
		for (User user2 : list) {
			System.out.println(user2);
		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	public static void testdelete() {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction(); 

		// 自己的代码
		// User user = (User) session.get(User.class, 1);
		// System.out.println(user);
		// System.out.println("----分割线------");
		// User user = (User) session.get(User.class, 1);
		// user.setUsername("问偶");
		// user.setAddress("是的噶");
		// session.save(user);
		// 多行输出
		// List<User> list = session.createQuery("from User").list();
		// for (User user2 : list) {
		// System.out.println(user2);
		// }

		User user = (User) session.get(User.class, 4);
		session.delete(user);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
