package com.springmvc.dao;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springmvc.model.RegisterUser;

@Repository
@Component("rdao")
public class RegisterDaoImp implements RegisterDao {
	
	@Autowired	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveusers(RegisterUser ruser) {
		 Integer id = (Integer) this.hibernateTemplate.save(ruser);
		 return id;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

	

}
