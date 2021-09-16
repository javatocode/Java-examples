package com.spring.pojo;

import java.util.Map;

import org.springframework.stereotype.Component;

public class Address {
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
