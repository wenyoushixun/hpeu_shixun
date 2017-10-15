package com.qingshixun.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="t_order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="code")
	private String code;
	
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="order_commodity",joinColumns={@JoinColumn(name="order_id")},inverseJoinColumns={@JoinColumn(name="commodity_id")})
	@Cascade(CascadeType.ALL)
	private Set<Commodity> commoditys=new HashSet<Commodity>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(Set<Commodity> commoditys) {
		this.commoditys = commoditys;
	}

}
