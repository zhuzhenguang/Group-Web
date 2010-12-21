package com.renren.group.dao;

import org.springframework.stereotype.Component;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.renren.group.entity.Image;

@Component
public class ImageDao extends HibernateDao<Image, Long> {
}
