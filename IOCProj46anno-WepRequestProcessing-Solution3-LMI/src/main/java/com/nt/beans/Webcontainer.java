package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("web")
@Scope("singleton")
public abstract class Webcontainer{
    @Lookup
	public  abstract RequestHandler getHandler();

	public void  handleRequest(String data) {
		System.out.println("WebContainer ::request came for processing with data::"+data+"---->"+this.hashCode());
		RequestHandler req=getHandler();
		req.processingRequest(data);
		System.out.println("WebContainer :: request processing completed with data::"+data);
	}


    
    
}
