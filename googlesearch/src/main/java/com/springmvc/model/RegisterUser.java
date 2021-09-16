package com.springmvc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
@Entity
@Table(name = "reg_user")
public class RegisterUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "DOB")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date;
	
	@Column(name = "Password")
	private String pass1;
	
	@Column(name = "ConfirmPassword")
	private String pass2;
	
	@Column(name = "Gender")
	private String gender;
	
	
	@ElementCollection
	@CollectionTable(name="kengine", joinColumns=@JoinColumn(name="rid"))
	@Column(name = "Engine")
	private List<String> fengine;
	
	@Column(name = "Profile")
	private transient CommonsMultipartFile profile;
	
	@Autowired
	@OneToOne(cascade = {CascadeType.ALL})
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getFengine() {
		return fengine;
	}

	public void setFengine(List<String> fengine) {
		this.fengine = fengine;
	}

	public CommonsMultipartFile getProfile() {
		return profile;
	}

	public void setProfile(CommonsMultipartFile profile) {
		this.profile = profile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterUser(int rid, String name, String email, Date date, String pass1, String pass2, String gender,
			List<String> fengine, CommonsMultipartFile profile, Address address) {
		super();
		this.rid = rid;
		this.name = name;
		this.email = email;
		this.date = date;
		this.pass1 = pass1;
		this.pass2 = pass2;
		this.gender = gender;
		this.fengine = fengine;
		this.profile = profile;
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegisterUser [rid=" + rid + ", name=" + name + ", email=" + email + ", date=" + date + ", pass1="
				+ pass1 + ", pass2=" + pass2 + ", gender=" + gender + ", fengine=" + fengine + ", profile=" + profile
				+ ", address=" + address + "]";
	}

	

	
	
	
	
}
