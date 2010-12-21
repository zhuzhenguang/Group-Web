package com.renren.group.util;

import java.util.List;

import com.renren.group.entity.Commodity;
import com.renren.group.entity.Type;

public class CommodityVO {

	private Type type;

	private List<Commodity> commodityList;

	public CommodityVO(Type type, List<Commodity> commodityList) {
		super();
		this.type = type;
		this.commodityList = commodityList;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<Commodity> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(List<Commodity> commodityList) {
		this.commodityList = commodityList;
	}

}
