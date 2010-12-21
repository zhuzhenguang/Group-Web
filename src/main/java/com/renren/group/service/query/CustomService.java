package com.renren.group.service.query;

import java.util.List;

import com.renren.group.entity.Commodity;
import com.renren.group.entity.Custom;
import com.renren.group.util.CommodityVO;
import com.renren.group.util.SortType;

/**
 * The Interface CustomService.
 */
public interface CustomService {

	/**
	 * Save or update Custom collection.
	 * 
	 * @param customs the customs
	 */
	void save(List<Custom> customs);

	/**
	 * Delete by id.
	 * 
	 * @param ids the ids
	 */
	void delete(List<Long> ids);

	/**
	 * Search Custom by id.
	 * 
	 * @param id the id
	 * @return the custom
	 */
	Custom search(long id);

	/**
	 * Search all Custom.
	 * 
	 * @return the list
	 */
	List<Custom> searchAll();

	/**
	 * Search custom type commodities.
	 * 
	 * @param typeCode the type code
	 * @param sortType the sort type
	 * @return the list
	 */
	List<CommodityVO> searchCustomTypeCommodities(List<String> typeCodes,
			SortType sortType);

	/**
	 * Search custom site commodities.
	 * 
	 * @param url the url
	 * @return the list
	 */
	List<Commodity> searchCustomSiteCommodities(String url);
}
