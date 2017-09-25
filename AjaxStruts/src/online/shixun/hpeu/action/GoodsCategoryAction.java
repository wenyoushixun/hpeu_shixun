/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.action;

import java.util.List;

import online.shixun.hpeu.model.GoodsCategoryModel;
import online.shixun.hpeu.service.GoodsCategoryServiceImpl;

public class GoodsCategoryAction {

	private GoodsCategoryServiceImpl categoryService = new GoodsCategoryServiceImpl();

	private List<GoodsCategoryModel> categories;

	/**
	 * 加载商品类别页面
	 * @return
	 */
	public String list() {
		// 接收商品类别列表
		categories = categoryService.getGoodsCategories();
		
		return "success";
	}

	public List<GoodsCategoryModel> getCategories() {
		return categories;
	}

	public void setCategories(List<GoodsCategoryModel> categories) {
		this.categories = categories;
	}

}
