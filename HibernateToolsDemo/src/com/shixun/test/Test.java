package com.shixun.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shixun.TttUser;
import com.shixun.TttUserId;

public class Test {

	static SessionFactory sessionFactory;
	
	protected void setUp() throws Exception {
	    // A SessionFactory is set up once for an application
	    sessionFactory = new Configuration()
	            .configure() // configures settings from hibernate.cfg.xml
	            .buildSessionFactory();
	}
	
	public static void main(String[] args) throws Exception {
		
		Test t=new Test();
		t.setUp();
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		TttUserId tttUser=new TttUserId();
		tttUser.setUser("koli");
		tttUser.setBalance(1222);
		
		session.save(tttUser);
		
		session.getTransaction().commit();
		session.close();
	}

}
