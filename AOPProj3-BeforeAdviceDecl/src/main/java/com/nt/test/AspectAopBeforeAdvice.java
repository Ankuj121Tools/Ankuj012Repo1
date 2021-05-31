package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class AspectAopBeforeAdvice {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
		CarShowRoom showRoom=ctx.getBean("carsr",CarShowRoom.class);
		
		Scanner scr=new Scanner(System.in);
		 
		 System.out.println("Enter CustName");
		 String custName=scr.nextLine();
		 
		 
		 System.out.println("Enter CarModel");
		 String carModel=scr.nextLine();
		 
		 
		 System.out.println("Enter Price");
		 float price=scr.nextFloat();
		 
		 System.out.println(showRoom.sellCar(custName, carModel, price));
		 
		 ctx.close();
		
		 
	}

}
