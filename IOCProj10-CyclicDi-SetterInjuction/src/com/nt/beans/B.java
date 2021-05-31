package com.nt.beans;

public class B {
	private A a;
		public B() {
			System.out.println("0-parm constructor of B class");
		}
		
		public void setA(A a) {
			this.a=a;
			System.out.println("B Set this.a=a; ");
		}
}
