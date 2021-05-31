package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class TranditionalDependencyLookupTest {

	public static void main(String[] args) {
		
		//create IOCcontaners
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean object
		Cricketer cric=ctx.getBean("cric",Cricketer.class);
		//invoke a meyhod
		System.out.println("----------------------------------");
		cric.bowling();
		System.out.println("----------------------------------");
		cric.fielding();
		System.out.println("----------------------------------");
		cric.batting();
		System.out.println("----------------------------------");
		//close contaner
		((AbstractApplicationContext) ctx).close();
	}

}
