package com.renren.group.service.query.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.renren.group.dao.CustomDao;
import com.renren.group.entity.Commodity;
import com.renren.group.entity.Custom;
import com.renren.group.entity.Type;
import com.renren.group.service.query.CommonQueryService;
import com.renren.group.service.query.CustomService;
import com.renren.group.util.CommodityVO;
import com.renren.group.util.SortType;

@Component
@Transactional
public class CustomServiceImpl implements CustomService {

	private CustomDao customDao;

	private CommonQueryService commonQueryService;

	@Override
	public void save(List<Custom> customs) {
		for (Custom custom : customs) {
			customDao.save(custom);
		}
	}

	@Override
	public void delete(List<Long> ids) {
		for (Long id : ids) {
			customDao.delete(id);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Custom search(long id) {
		return customDao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Custom> searchAll() {
		return customDao.getAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<CommodityVO> searchCustomTypeCommodities(
			List<String> typeCodes, SortType sortType) {
		List<CommodityVO> commodityVOList = Lists.newArrayList();

		for (String typeCode : typeCodes) {
			Type type = commonQueryService.getTypeByCode(typeCode);
			List<Commodity> commoditiesByType = commonQueryService
					.getCommoditiesByType(typeCode, sortType);
			commodityVOList.add(new CommodityVO(type, commoditiesByType));
		}

		return commodityVOList;
	}

	@Override
	public List<Commodity> searchCustomSiteCommodities(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	public void setCustomDao(CustomDao customDao) {
		this.customDao = customDao;
	}

	@Autowired
	public void setCommonQueryService(CommonQueryService commonQueryService) {
		this.commonQueryService = commonQueryService;
	}

}
