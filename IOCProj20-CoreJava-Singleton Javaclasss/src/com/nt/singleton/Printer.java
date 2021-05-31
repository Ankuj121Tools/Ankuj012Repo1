package com.nt.singleton;

public class Printer{
    
	private static Printer INSTANCE;
	
	private Printer(){
		System.out.println("0-param constructor is exicuted in Printer");
	}
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;	
	}
	public void sum(int x,int y) {
		System.out.println("sum of x and y is"+(x+y));
	}
}
