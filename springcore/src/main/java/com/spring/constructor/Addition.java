package com.spring.constructor;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("const int,int");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("const double,double");
	}
	public void dosum() {
		System.out.println("Addition : " + (this.a + this.b));
	}
}
