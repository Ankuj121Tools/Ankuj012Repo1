package com.nt.test;



import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVo;

public class Test {

	public static void main(String[] args) {
      
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	BankController controller=factory.getBean("bankController",BankController.class);
	
	Scanner scr=new Scanner(System.in);
	
	CustomerVo vo=new CustomerVo();
	
	System.out.println("Enter customer name");
	String cname=scr.nextLine();
	vo.setCname(cname);
	
	System.out.println("Enter customer Add");
	String cadd=scr.nextLine();
    vo.setCadd(cadd);
    
    System.out.println("Enter Pinciple amount::");
    String amt=scr.nextLine();
    vo.setPamt(amt);
    
    System.out.println("Enter Rate of Intrest::");
    String rate=scr.nextLine();
    vo.setRate(rate);
    
    System.out.println("Enter Time of Intrest::");
    String time=scr.nextLine();
    vo.setTime(time);
    
    
    try {
    	String result=controller.processCustomer(vo);
    	System.out.println(result);
    }catch(Exception e) {
		  System.out.println("Problem in Customer Registration");
		e.printStackTrace();
	}
  }

}
