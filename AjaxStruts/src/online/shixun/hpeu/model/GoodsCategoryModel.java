/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "al_goods_category")
public class GoodsCategoryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = 0L;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "goodsCategory", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	private Set<GoodsModel> goods = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<GoodsModel> getGoods() {
		return goods;
	}

	public void setGoods(Set<GoodsModel> goods) {
		this.goods = goods;
	}
	
}
