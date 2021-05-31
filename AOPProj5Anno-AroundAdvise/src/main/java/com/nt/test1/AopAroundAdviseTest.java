package com.nt.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AopAroundAdviseTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
         
		BankService bankService=ctx.getBean("bankService",BankService.class);
		
		System.out.println(bankService.calcSimpleIntrestAmt(10000,6, 12));
		System.out.println("------------------------");
		System.out.println(bankService.calcCompoundIntrestAmt(10000,8, 12));
		((AbstractApplicationContext) ctx).close();
	}

}


