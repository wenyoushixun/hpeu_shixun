package com.shixun.project.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.shixun.project.model.Commodity;
import com.shixun.project.util.HibernateUtil;

public class HibernateTest {

	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.save(new Commodity("明博电视", new Date(), "家庭必备", new Date()));
		session.save(new Commodity("创维电视", new Date(), "高清视频播放", new Date()));
		session.save(new Commodity("TCL电视", new Date(), "高清视频播放", new Date()));
		session.save(new Commodity("海尔电视", new Date(), "高清视频播放", new Date()));
		session.save(new Commodity("康佳电视", new Date(), "高清视频播放", new Date()));
		session.save(new Commodity("长虹电视", new Date(), "高清视频播放", new Date()));

		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void listCommodityWithPaging() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Criteria criteria = session.createCriteria(Commodity.class);
		criteria.add(Restrictions.like("name", "%电视%"));

		int n = 3;
		int page = 2;
		criteria.setFirstResult((page - 1) * n);
		criteria.setMaxResults(n);

		criteria.addOrder(Order.asc("createDate"));

		@SuppressWarnings("unchecked")
		List<Commodity> list = criteria.list();
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}

		System.out.println("按创建时间的先后输出！");
		
		
		session.getTransaction().commit();
		session.close();
	}

}
