package com.shixun.project.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.shixun.project.model.Commodity;
import com.shixun.project.util.HibernateUtil;

public class HibernateTest {

	/**
	 * 保存商品
	 */
	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.save(new Commodity("明博电视", new Date(), "家庭必备", new Date()));
		session.save(new Commodity("广角电视", new Date(), "高清视频播放", new Date()));
		session.save(new Commodity("毛巾", new Date(), "毛巾搽脸的工具", new Date()));

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * 基于商品ID和商品名称查询
	 */
	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Query query =session.createQuery("from Commodity where id=? and name like ?");
		query.setParameter(0, 1);
		query.setParameter(1, "%电视%");
		
		@SuppressWarnings("unchecked")
		List<Commodity> list = query.list();
		for (Commodity commodity : list) {
			System.out.println(commodity);
		}
		
		session.getTransaction().commit();
		session.close();
	}

}
