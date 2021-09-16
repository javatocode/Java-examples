package com.spring.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	@Autowired
	@Qualifier("adddata")
	private Map<String,String> info;

	public Map<String, String> getInfo() {
		return info;
	}

	public void setInfo(Map<String, String> info) {
		this.info = info;
	}

	public Address(Map<String, String> info) {
		super();
		this.info = info;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [info=" + info + "]";
	}
	
	
}
