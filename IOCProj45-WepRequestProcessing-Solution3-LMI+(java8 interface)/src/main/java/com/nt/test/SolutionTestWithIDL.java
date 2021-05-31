package com.nt.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Webcontainer;

public class SolutionTestWithIDL{
	public static void main(String[] args) {
		//create container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Webcontainer container=ctx.getBean("web",Webcontainer.class);
		System.out.println("--------------");
		container.handleRequest("hii");
		System.out.println("--------------");
		container.handleRequest("hello");
		System.out.println("--------------");
		container.handleRequest("take care");
		System.out.println("---------------");
		Date date=ctx.getBean("myint",Date.class);
		System.out.println(date);
		((AbstractApplicationContext) ctx).close();
	}

}
