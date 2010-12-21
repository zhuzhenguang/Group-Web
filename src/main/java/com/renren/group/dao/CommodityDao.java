package com.renren.group.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.renren.group.entity.Commodity;

/**
 * The Class CommodityDao.
 */
@Component
public class CommodityDao extends HibernateDao<Commodity, Long> {

	/** The Constant FIND_COMMODITIES_BY_TYPE. */
	private static final String FIND_COMMODITIES_BY_TYPE = "from Commodity where type.code=? order by ?";

	/**
	 * Gets the commodities by type.
	 * 
	 * @param typeCode the type code
	 * @param sortValue the sort value
	 * @return the commodities by type
	 */
	public List<Commodity> getCommoditiesByType(String typeCode,
			String sortValue) {
		return find(FIND_COMMODITIES_BY_TYPE, typeCode, sortValue);
	}
}
