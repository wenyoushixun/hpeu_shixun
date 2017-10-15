package com.shixun.project.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
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

	@SuppressWarnings("unchecked")
	@Test
	public void listCommodityWithPaging() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Query query = session.createQuery("from Commodity where name like ?");
		query.setParameter(0, "%电视%");
		query.setFirstResult(3);
		query.setMaxResults(3);
		
		List<Commodity> list = query.list();
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}

		session.getTransaction().commit();
		session.close();
	}

}
