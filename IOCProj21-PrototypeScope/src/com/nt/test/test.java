package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class test {

	public static void main(String[] args) {
		//create a ApplicatinContextContaner
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		System.out.println("---------------");
	    WelcomeGreetings greetings=ctx.getBean("wsg",WelcomeGreetings.class);
	
		System.out.println(greetings.genrateWishMessage("Ankuj"));

	}

}
