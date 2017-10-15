package com.shixun.project.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.shixun.project.model.Commodity;
import com.shixun.project.util.HibernateUtil;

public class HibernateTest {

	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		session.save(new Commodity("明博电视",new Date(),"家庭必备",new Date()));
		session.save(new Commodity("滑板",new Date(),"便利的交通工具",new Date()));
		session.save(new Commodity("毛巾",new Date(),"洗脸",new Date()));
		session.save(new Commodity("肥皂",new Date(),"洗澡",new Date()));
		session.save(new Commodity("电动自行车",new Date(),"便利的交通工具",new Date()));
		session.save(new Commodity("自行车",new Date(),"便利的交通工具",new Date()));
		
		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Criteria criteria = session.createCriteria(Commodity.class);
		criteria.add(Restrictions.lt("id",100));
		criteria.add(Restrictions.like("name","%自行车%"));
		@SuppressWarnings("unchecked")
		List<Commodity> list = criteria.list();
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
		
		session.getTransaction().commit();
		session.close();
	}

}
