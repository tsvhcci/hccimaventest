package com.hcci.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hcci.entity.HelloEntity;

@Component
public class HelloDAOImpl extends GenericHibernateDao<HelloEntity, Serializable>implements HelloDAO{

	public List<HelloEntity> getAll() {
		System.out.println("Testing 123");
        return loadAll(HelloEntity.class);
	}


}
