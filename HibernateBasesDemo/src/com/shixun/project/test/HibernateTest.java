package com.shixun.project.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.shixun.project.model.Commodity;

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
	
		Commodity commodity=new Commodity();
		commodity.setName("电脑");
		commodity.setCreateDate(new Date());
		commodity.setDescribe("联系世界");
		commodity.setModifyDate(new Date());		
		
		session.save(commodity);	

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
	
		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		System.out.println(commodity);
		

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
	
		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		commodity.setName("手机");
		
		session.save(commodity);
		
		session.getTransaction().commit();
		System.out.println(commodity);
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
	
		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		session.delete(commodity);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
