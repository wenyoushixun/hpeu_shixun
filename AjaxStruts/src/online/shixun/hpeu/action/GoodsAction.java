/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.action;

import java.util.List;

import online.shixun.hpeu.model.GoodsModel;
import online.shixun.hpeu.service.GoodsServiceImpl;

public class GoodsAction {
	
	private GoodsServiceImpl goodsService = new GoodsServiceImpl();
	
	// 从页面接收商品类别id
	private Long categoryId;
	
	// 从页面接收商品id
	private Long goodsId;
	
	// 从DB获取商品列表，用于展示到页面上
	private List<GoodsModel> goods;
	
	// 从DB获取商品描述信息，用于展示到页面上
	private String description;
	
	/**
	 * 加载商品列表页
	 * @return
	 */
	public String list() {
		goods = goodsService.getGoodsByCategoryId(categoryId);
		
		return "success";
	}
	
	/**
	 * 获取商品描述信息
	 * @return
	 */
	public String description() {
		// 通过商品id获取商品描述信息
		description = goodsService.getGoodsById(goodsId).getDescription();
		
		return "success";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public List<GoodsModel> getGoods() {
		return goods;
	}

	public void setGoods(List<GoodsModel> goods) {
		this.goods = goods;
	}

}
