package com.renren.group.service.query.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.renren.group.dao.CommodityDao;
import com.renren.group.dao.TypeDao;
import com.renren.group.entity.Commodity;
import com.renren.group.entity.Type;
import com.renren.group.service.query.CommonQueryService;
import com.renren.group.util.CommodityVO;
import com.renren.group.util.Site;
import com.renren.group.util.SortType;

@Component
@Transactional
public class CommonQueryServiceImpl implements CommonQueryService {

	private CommodityDao commodityDao;

	private TypeDao typeDao;

	@Override
	@Transactional(readOnly = true)
	public List<Commodity> getCommoditiesByType(String typeCode,
			SortType sortType) {
		return commodityDao.getCommoditiesByType(typeCode, sortType.getType());
	}

	@Override
	@Transactional(readOnly = true)
	public List<Commodity> getCommoditiesBySite(String url) {
		return commodityDao.findBy("url", url);
	}

	@Override
	public List<CommodityVO> getAllCommoditiesClassifyByType(SortType sortType) {
		List<CommodityVO> commodityVOList = Lists.newArrayList();

		Set<Type> allTypes = getAllTypes();
		for (Type type : allTypes) {
			List<Commodity> commoditiesByType = getCommoditiesByType(
					type.getCode(), sortType);
			CommodityVO commodityVO = new CommodityVO(type, commoditiesByType);
			commodityVOList.add(commodityVO);
		}

		return commodityVOList;
	}

	@Override
	public Set<Site> getAllSites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Set<Type> getAllTypes() {
		return Sets.newHashSet(typeDao.getAll());
	}

	@Override
	@Transactional(readOnly = true)
	public Type getTypeByCode(String code) {
		return typeDao.get(code);
	}

	@Autowired
	public void setCommodityDao(CommodityDao commodityDao) {
		this.commodityDao = commodityDao;
	}

	@Autowired
	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

}
