package com.nt.beans;

public class WelcomeGreetings {
	
	static {
		System.out.println("Static block Executed");	
	}
	
	public WelcomeGreetings(){
		System.out.println("0-param constructor executed");
	}
	
	public String genrateWishMessage(String user) {
		return "Welcome to Spring "+user;
	}

}
