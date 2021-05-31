package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Webcontainer implements ApplicationContextAware {
    private String beanId;
    private ApplicationContext ctx;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public Webcontainer() {
		System.out.println("Webcontainer 0-ParamConstructor");
		
	}

	public void  handleRequest(String data) {
		RequestHandler req=ctx.getBean(beanId,RequestHandler.class);
		System.out.println("WebContainer ::request came for processing with data::"+data+"---->"+this.hashCode());
		req.processingRequest(data);
		System.out.println("WebContainer :: request processing completed with data::"+data);
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Webcontainer.setApplicationContext()");
		this.ctx=ctx;
		
	}
    
    
}
