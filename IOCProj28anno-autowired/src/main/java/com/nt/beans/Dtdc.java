package com.nt.beans;

public class Dtdc implements Courier {

	public Dtdc() {
		System.out.println("0-param const od Dtdc");
	}
	
	public String deliver(int oid) {
		
		return "Delivering(dtdc) product haveing "+oid+" Order id";
	}

}
