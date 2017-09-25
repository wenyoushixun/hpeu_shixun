/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.service;

import java.util.List;

import online.shixun.hpeu.model.GoodsCategoryModel;
import online.shixun.hpeu.util.HibernateUtil;

public class GoodsCategoryServiceImpl {

	/**
	 * 获取商品类别列表
	 * @return
	 */
	public List<GoodsCategoryModel> getGoodsCategories() {
		@SuppressWarnings("unchecked")
		List<GoodsCategoryModel> categories = HibernateUtil.getSession().createQuery("from GoodsCategoryModel").list();
		
		return categories;
	}
	
}
