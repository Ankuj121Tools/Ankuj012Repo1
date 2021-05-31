package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Webcontainer {
    private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public Webcontainer() {
		System.out.println("Webcontainer 0-ParamConstructor");
		
	}

	public void  handleRequest(String data) {
		//create contaner
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		RequestHandler req=ctx1.getBean("req",RequestHandler.class);
		System.out.println("WebContainer ::request came for processing with data::"+data+"---->"+this.hashCode());
		req.processingRequest(data);
		System.out.println("WebContainer :: request processing completed with data::"+data);
	}
    
    
}
