package com.spring.orm.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_add")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sadd_id;
	
	@Column(name="stud_city")
	private String city;
	
	@Column(name="stud_state")
	private String state;
	
	@Column(name="stud_zip")
	private int zipcode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getSadd_id() {
		return sadd_id;
	}
	public void setSadd_id(int sadd_id) {
		this.sadd_id = sadd_id;
	}
	public Address(int sadd_id, String city, String state, int zipcode) {
		super();
		this.sadd_id = sadd_id;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [sadd_id=" + sadd_id + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
	
}
