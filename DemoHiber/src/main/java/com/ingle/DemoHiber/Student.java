package com.ingle.DemoHiber;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



// allow for database


// @Entity(name="stu_table") change default table name to this table
// @Table(name="stu_table")
@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	
	@Id
	private int sid;
	private StudName sname;
	
	// @Transient it means sphone is not gonna store..
	private String sphone;
	
	
	// for one student to one laptop.
//	@OneToOne
//	private Laptop laptop;
	
	// for one student to many laptop.
	
//	@OneToMany(mappedBy="student" )
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	// @Column(name="stud_city") it change attribute name 
	private String scity;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public StudName getSname() {
		return sname;
	}
	public void setSname(StudName sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	
    public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	
	
}
