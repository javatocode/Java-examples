package com.spring.referencetype;

public class Ajay {
	private int x;
	private Vijay v;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Vijay getV() {
		return v;
	}
	public void setV(Vijay v) {
		this.v = v;
	}
	public Ajay(int x, Vijay v) {
		super();
		this.x = x;
		this.v = v;
	}
	public Ajay() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ajay [x=" + x + ", v=" + v + "]";
	}
	
}
