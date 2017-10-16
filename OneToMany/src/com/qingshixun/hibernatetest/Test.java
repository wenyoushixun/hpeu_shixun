package com.qingshixun.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.qingshixun.model.Customer;
import com.qingshixun.model.Order;

public class Test {

	// static SessionFactory sessionFactory;
	//
	// protected void setUp() throws Exception {
	// // A SessionFactory is set up once for an application
	// sessionFactory = new Configuration()
	// .configure() // configures settings from hibernate.cfg.xml
	// .buildSessionFactory();
	// }

	public static void main(String[] args) throws Exception {

		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		// Test t=new Test();
		// t.setUp();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Customer customer = new Customer();
		customer.setName("张三");
		// 产生了两个订单
		Order order1 = new Order();
		order1.setName("鼠标");
		order1.setPrice(999d);
		Order order2 = new Order();
		order2.setName("键盘");
		order2.setPrice(1299d);
		Order order3 = new Order();
		order3.setName("显示屏");
		order3.setPrice(1799d);
		// 建立关系
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		order3.setCustomer(customer);
		customer.getOrders().add(order1);
//		customer.getOrders().add(order2);
		customer.getOrders().add(order3);
		// 保存
		// session.save(order1);
		// session.save(order2);
		session.save(order3);
		// session.save(customer);

		session.getTransaction().commit();
		session.close();
	}

}
