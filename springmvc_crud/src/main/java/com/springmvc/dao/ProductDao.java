package com.springmvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	
	// get all products
	public List<Product> getproduct(){
	List<Product> p = 	this.hibernateTemplate.loadAll(Product.class);
		return p;
	}
	
	// delete product
	@Transactional
	public void deleteproduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get the single product
	public Product getoneproduct(int pid) {
		return this.hibernateTemplate.get(Product.class,pid);
	}
}