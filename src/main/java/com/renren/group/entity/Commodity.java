package com.renren.group.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;

/**
 * The persistent class for the COMMODITY database table.
 * 
 */
@Entity
public class Commodity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private double discount;

	private String flag;

	@Column(name = "INSERT_DATE")
	private String insertDate;

	@Column(name = "ORIGINAL_PRICE")
	private double originalPrice;

	private String place;

	private double price;

	@Column(name = "SOLD_OUT")
	private int soldOut;

	private String url;

	// bi-directional many-to-one association to Type
	@ManyToOne(fetch = FetchType.LAZY)
	private Type type;

	// bi-directional many-to-one association to Image
	@OneToMany(mappedBy = "commodity")
	private Set<Image> images;

	public Commodity() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public double getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSoldOut() {
		return this.soldOut;
	}

	public void setSoldOut(int soldOut) {
		this.soldOut = soldOut;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Set<Image> getImages() {
		return this.images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}

}