package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.dao.ProductDao;
import com.springmvc.model.Product;

@Controller
public class CrudController {
	
	@Autowired
	private ProductDao pdoa;
	
	@RequestMapping("/")
	public String home(Model m) {
		m.addAttribute("title", "Start App");
		List<Product> p = pdoa.getproduct();
		m.addAttribute("pd", p);
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("title", "add product");
		return "add_product";
	}
	
	// handle product
	@RequestMapping(value="/addpro",method = RequestMethod.POST)
	public RedirectView handle(@ModelAttribute Product p,HttpServletRequest req) {
		RedirectView r = new RedirectView();
		this.pdoa.createProduct(p);
		r.setUrl(req.getContextPath()+"/");
		return r;
	}
	
	@RequestMapping(value="/deletepro/{proid}")
	public RedirectView deleteproduct(@PathVariable("proid") int proid,HttpServletRequest req) {
		RedirectView r = new RedirectView();
		this.pdoa.deleteproduct(proid);
		r.setUrl(req.getContextPath()+"/");
		return r;
	}
	
	@RequestMapping(value="/update/{proid}")
	public String updateproduct(@PathVariable("proid") int id,Model m) {
		System.out.println("update" + id);
		Product p =  this.pdoa.getoneproduct(id);
		m.addAttribute("pd", p);
		return "update_form";
	}
	
	
}
