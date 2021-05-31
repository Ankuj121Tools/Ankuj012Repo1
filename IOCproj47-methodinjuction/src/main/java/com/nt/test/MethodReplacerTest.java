package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanIntrestcalculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		//create contaner
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		BankLoanIntrestcalculator calculator=ctx.getBean("blic",BankLoanIntrestcalculator.class);
		System.out.println(calculator.getClass());
		System.out.println(calculator.calculateIntrestAmount(10000, 10, 12));
        
		((AbstractApplicationContext) ctx).close();
	}

}
