package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.exception.InternalProblemException;
import com.nt.service.ShoppingStore;

public class ThrowsAdviceTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		ShoppingStore store=ctx.getBean("store",ShoppingStore.class);
		
		try {
			
			System.out.println(store.calcBillAmount(10000, 5));
			
		}catch(InternalProblemException iae) {
			iae.printStackTrace();
		}
				
        ((AbstractApplicationContext) ctx).close();
	}

}
