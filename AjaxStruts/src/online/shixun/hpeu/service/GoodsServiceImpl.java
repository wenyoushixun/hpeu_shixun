/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.service;

import java.util.List;

import online.shixun.hpeu.model.GoodsModel;
import online.shixun.hpeu.util.HibernateUtil;

public class GoodsServiceImpl {

	/**
	 * 获取商品列表
	 * @param categoryId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<GoodsModel> getGoodsByCategoryId(Long categoryId) {
		return HibernateUtil.
				getSession().
				createQuery("FROM GoodsModel WHERE goodsCategory.id = :categoryId").
				setParameter("categoryId", categoryId).
				list();
	}
	
	/**
	 * 获取商品信息
	 * @param goodsId
	 * @return
	 */
	public GoodsModel getGoodsById(Long goodsId) {
		return (GoodsModel) HibernateUtil.getSession().get(GoodsModel.class, goodsId);
	}
	
}
