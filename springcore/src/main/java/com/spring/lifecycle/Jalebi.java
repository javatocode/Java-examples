package com.spring.lifecycle;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
public class Jalebi {
private double price;

public Jalebi(double price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "Jalebi [price=" + price + "]";
}

public Jalebi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

//@PostConstruct
public void start() {
	System.out.println("Start init method..");
}

//@PreDestroy
public void end() {
	System.out.println("End destroy method..");
}
}
