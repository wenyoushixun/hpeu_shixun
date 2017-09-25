/*****************************************************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*****************************************************************************/
package online.shixun.hpeu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "al_goods")
public class GoodsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = 0L;
	
	@Column
	private String name;
	
	@Column
	private Integer counts;
	
	@Column
	private Double price;
	
	@Column
	private String description;
	
	@ManyToOne
	private GoodsCategoryModel goodsCategory;

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

	public Integer getCounts() {
		return counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public GoodsCategoryModel getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(GoodsCategoryModel goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
