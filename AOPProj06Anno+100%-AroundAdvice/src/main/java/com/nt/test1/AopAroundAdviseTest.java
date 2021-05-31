package com.nt.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.confic.AopConfic;
import com.nt.service.BankService;

public class AopAroundAdviseTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AopConfic.class);
         
		BankService bankService=ctx.getBean("bankService",BankService.class);
		
		System.out.println(bankService.calcSimpleIntrestAmt(10000,6, 12));
		System.out.println("------------------------");
		System.out.println(bankService.calcCompoundIntrestAmt(10000,8, 12));
		System.out.println("------------------------");

		
		System.out.println(bankService.calcSimpleIntrestAmt(10000,6, 12));
		System.out.println("------------------------");
		System.out.println(bankService.calcCompoundIntrestAmt(10000,8, 12));
		((AbstractApplicationContext) ctx).close();
	}

}


