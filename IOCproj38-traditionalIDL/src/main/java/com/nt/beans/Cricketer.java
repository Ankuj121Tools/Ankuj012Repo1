package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	private String name;
	private String jersyno;
	private String beanId;

	public void setName(String name) {
		System.out.println("Cricketer.setName()");
		this.name = name;
	}
	public void setJersyno(String jersyno) {
		System.out.println("Cricketer.setJersyno()");
		this.jersyno = jersyno;
	}

	public void setBeanId(String beanId) {
		System.out.println("Cricketer.setBeanId()");
		this.beanId = beanId;
	}


	public Cricketer() {
		System.out.println("Cricketer.Cricketer()::0-param constructor");
	}
	public void fielding() {
		System.out.println("Mr."+name+" having jersyno "+jersyno+" is fielding ");
	}
	public void bowling() {
		System.out.println("Mr."+name+" having jersyno "+jersyno+" is Bowling ");

	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		//create contaner
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("2 nd IOCcontaner is created");
		CricketBat cbat=ctx.getBean(beanId,CricketBat.class);
		int score=cbat.scoreRuns();
		System.out.println("cricketer runs "+score);
		
		
	}

}
