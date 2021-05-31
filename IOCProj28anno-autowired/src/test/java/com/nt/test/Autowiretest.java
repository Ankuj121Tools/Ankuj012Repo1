package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class Autowiretest {

	public static void main(String[] args) {
        //create contaner
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    //create bean class object
		Flipkart fpk=ctx.getBean("fpk",Flipkart.class);
		//invoking message in fpk class
	    String msg=	fpk.shopping(new String[] {"Shirt","Trouser","Shoe"},new float[] {1700.00f,3000.00f,3200.00f});
	    //print Messagwe
	    System.out.println(msg);
	    //close contaner
	   ((AbstractApplicationContext) ctx).close();
	}

}
