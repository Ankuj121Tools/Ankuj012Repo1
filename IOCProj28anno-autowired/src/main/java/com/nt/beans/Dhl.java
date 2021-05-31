package com.nt.beans;

public class Dhl implements Courier {

	 public Dhl() {
		 System.out.println("0-parm const of Dhl");
	 }
	public String deliver(int oid) {

		return "Delivering(Dhl) product haveing "+oid+" Order id";
	
	}

}
