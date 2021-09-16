package com.spring.constructor;

import java.util.Set;

public class Address {
	private String state;
	private String city;
	private Set<Integer> crate;
	public Address(String state, String city, Set<Integer> crate) {
		super();
		this.state = state;
		this.city = city;
		this.crate = crate;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", crate=" + crate + "]";
	}
	
	
}
