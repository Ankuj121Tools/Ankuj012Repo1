package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		OnlineStore proxy=ctx.getBean("store",OnlineStore.class);
		
		System.out.println(proxy.shopping(new String[] {"cap","haleem,","K-P","cent"}, new double[] {200,300,13400,1000}));

		((AbstractApplicationContext) ctx).close();
	}

}
