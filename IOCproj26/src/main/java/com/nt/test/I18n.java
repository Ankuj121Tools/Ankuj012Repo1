package com.nt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18n {

	public static void main(String[] args) {
		//create IOC Contaner
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    //create locale obj
		Locale locale=new Locale(args[0],args[1]);
		String msg1=ctx.getMessage("wishMsg",new Object[] {"Buddy","Welcome "},"msg",locale);
		String msg2=ctx.getMessage("welcome.msg",new Object[] {},"msg2",locale);
		String msg3=ctx.getMessage("bye.msg",new Object[] {},"msg3",locale);
		System.out.println(msg1+"  "+msg2+" "+msg3);
		//close contaner
		((AbstractApplicationContext) ctx).close();

	}//close Method

}//close class
