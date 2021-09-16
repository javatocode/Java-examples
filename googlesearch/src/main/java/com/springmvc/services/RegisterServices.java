package com.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springmvc.dao.RegisterDaoImp;
import com.springmvc.model.RegisterUser;

@Service
public class RegisterServices {

	 @Autowired	
	 @Qualifier("rdao")
	 private RegisterDaoImp registerDaoImp; 	
	 
	 public int createUser(RegisterUser user) {
		 return this.registerDaoImp.saveusers(user);
	 }
	
	
}
