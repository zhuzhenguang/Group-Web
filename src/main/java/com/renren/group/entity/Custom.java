package com.renren.group.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOM database table.
 * 
 */
@Entity
public class Custom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "CUSTOM_CONTENT")
	private String customContent;

	@Column(name = "CUSTOM_NAME")
	private String customName;

	@Column(name = "CUSTOM_TYPE")
	private String customType;

	@Column(name = "USER_ID")
	private int userId;

	public Custom() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomContent() {
		return this.customContent;
	}

	public void setCustomContent(String customContent) {
		this.customContent = customContent;
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomType() {
		return this.customType;
	}

	public void setCustomType(String customType) {
		this.customType = customType;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}