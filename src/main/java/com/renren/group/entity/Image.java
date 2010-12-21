package com.renren.group.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IMAGE database table.
 * 
 */
@Entity
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String path;

	@Column(name = "SYS_NAME")
	private String sysName;

	// bi-directional many-to-one association to Commodity
	@ManyToOne(fetch = FetchType.LAZY)
	private Commodity commodity;

	public Image() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSysName() {
		return this.sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

}