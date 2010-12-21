package com.renren.group.service.query;

import java.util.List;
import java.util.Set;

import com.renren.group.entity.Commodity;
import com.renren.group.entity.Type;
import com.renren.group.util.CommodityVO;
import com.renren.group.util.Site;
import com.renren.group.util.SortType;

/**
 * The Interface CommonQueryService. 一般的简单查询服务
 */
public interface CommonQueryService {

	/**
	 * Gets the commodities by type. 根据类型获取商品列表，需要排序类型
	 * 
	 * @param typeCode the type code
	 * @param sortType the sort type
	 * @return the commodities by type
	 */
	List<Commodity> getCommoditiesByType(String typeCode, SortType sortType);

	/**
	 * Gets the commodities by site. 根据网站来获取商品
	 * 
	 * @param url the url
	 * @return the commodities by site
	 */
	List<Commodity> getCommoditiesBySite(String url);

	/**
	 * Gets the all commodities classify by type. 获取全部商品，并按照类型排列，需要排序类型
	 * 
	 * @param sortType the sort type
	 * @return the all commodities classify by type
	 */
	List<CommodityVO> getAllCommoditiesClassifyByType(SortType sortType);

	/**
	 * Gets the all site. 获取全部网站
	 * 
	 * @return the all site
	 */
	Set<Site> getAllSites();

	/**
	 * Gets the all type. 获取全部类型
	 * 
	 * @return the all type
	 */
	Set<Type> getAllTypes();

	/**
	 * Gets the type by code. 根据code获取类型对象
	 * 
	 * @param code the code
	 * @return the type by code
	 */
	Type getTypeByCode(String code);
}
