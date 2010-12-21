package com.renren.group.dao;

import org.springframework.stereotype.Component;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.renren.group.entity.Custom;

@Component
public class CustomDao extends HibernateDao<Custom, Long> {
}
