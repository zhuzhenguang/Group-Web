package com.renren.group.dao;

import org.springframework.stereotype.Component;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.renren.group.entity.Admin;

@Component
public class AdminDao extends HibernateDao<Admin, Integer> {
}
