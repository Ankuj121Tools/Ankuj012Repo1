package com.nt.beans;

import java.util.Date;

public interface MyInterface {
	public static Date createDate(){
		System.out.println("My Interface");
		return new Date();
	}

}
