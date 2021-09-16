package com.ingle.DemoHiber;

import javax.persistence.Embeddable;

@Embeddable // override to exisiting table 
public class StudName {
	String fname;
	String mname;
	String lname;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "StudName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
}
