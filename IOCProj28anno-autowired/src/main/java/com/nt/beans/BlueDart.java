package com.nt.beans;

public class BlueDart implements Courier {
	  
	public BlueDart() {
		
	System.out.println("0-param const of BlueDart");	
	}

	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Delivering(BlueDart) product haveing "+oid+" Order id";
	}

}
