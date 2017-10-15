package com.shixun.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_commodity")
public class Commodity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String name;

	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@Column(name="commodityDescribe")
	private String describe;
	
	@Temporal(TemporalType.DATE)
	private Date modifyDate;
	
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commodity(String name, Date createDate, String describe, Date modifyDate) {
		super();
		this.name = name;
		this.createDate = createDate;
		this.describe = describe;
		this.modifyDate = modifyDate;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", createDate=" + createDate + ", describe=" + describe
				+ ", modifyDate=" + modifyDate + "]";
	}
	
}
