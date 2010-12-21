package com.renren.group.dao;

import org.springframework.stereotype.Component;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.renren.group.entity.Type;

@Component
public class TypeDao extends HibernateDao<Type, String> {
}
