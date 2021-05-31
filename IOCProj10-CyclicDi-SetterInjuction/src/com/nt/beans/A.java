package com.nt.beans;

public class A {
	private B b;
	
	public A() {
		System.out.println("0-parm constructor of A class");
	}
	
	public void setB(B b) {
		this.b=b;
		System.out.println("A Set this.b=b;");
	}

}
