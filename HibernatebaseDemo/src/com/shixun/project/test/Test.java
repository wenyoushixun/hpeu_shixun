package com.shixun.project.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.shixun.project.model.Book;

public class Test {

	public static void main(String[] args) {
		Configuration configure = new Configuration().configure();

		// SessionFactory sessionFactory = configure.buildSessionFactory();
		// 使用如下方法替代
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry serviceRegistry = ssrb.applySettings(configure.getProperties()).build();
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		Book book = new Book();
		book.setBookname("人生讲解");
		book.setPrice(56.8);
		book.setPublishdate(new Date());
		
		session.save(book);
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	

	}
}
