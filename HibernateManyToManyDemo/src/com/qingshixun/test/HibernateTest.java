package com.qingshixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.qingshixun.model.Commodity;
import com.qingshixun.model.Order;

public class HibernateTest {

	@Test
	public void saveOrderAndCommoditys() {

		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Order order1 = new Order();
		order1.setCode("111");
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode("222");
		order2.setCreateDate(new Date());
		

		Commodity commodity1=new Commodity();
		commodity1.setName("手机");
		commodity1.setCreateDate(new Date());
		commodity1.setDescribe("联系世界");
		commodity1.setModifyDate(new Date());
		
		Commodity commodity2=new Commodity();	
		commodity2.setName("冰箱");
		commodity2.setCreateDate(new Date());
		commodity2.setDescribe("冰冻世界");
		commodity2.setModifyDate(new Date());
		
		order1.getCommoditys().add(commodity1);
		order1.getCommoditys().add(commodity2);
		order2.getCommoditys().add(commodity1);
		order2.getCommoditys().add(commodity2);

		session.save(order1);
		session.save(order2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void getOrderAndCommoditys() {
		
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Order order = (Order)session.get(Order.class, 1);
		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		System.out.println(order);
		System.out.println(commodity);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void getCommodityAndOrders() {
		
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Commodity commodity = (Commodity)session.get(Commodity.class, 1);
		Order order = (Order)session.get(Order.class, 1);
		System.out.println(order);
		System.out.println(commodity);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
