package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.BookInfo;
import com.nt.service.IBookStoreMgmtService;

public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		IBookStoreMgmtService service=ctx.getBean("service",IBookStoreMgmtService.class);
		
		try {
			 BookInfo info= service.fetchBookById(101);
			 System.out.println(info);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
        ((AbstractApplicationContext) ctx).close();
	}

}
