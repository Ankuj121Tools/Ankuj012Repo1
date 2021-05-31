package com.nt.test;

import com.nt.singleton.Printer;

public class Test {

	public static void main(String[] args) {
		//get Printer class Object
		Printer print1=Printer.getInstance();
         
		Printer print2=Printer.getInstance();
		
		System.out.println(print1.hashCode());
		System.out.println(print2.hashCode());
		
		System.out.println(print1==print2);
		print1.sum(20, 30);print2.sum(40,30);
		
	//	Printer print3=new Printer();
	}

}
