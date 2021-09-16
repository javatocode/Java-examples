package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
 private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init is running....");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destoy is running....");
	
}

}