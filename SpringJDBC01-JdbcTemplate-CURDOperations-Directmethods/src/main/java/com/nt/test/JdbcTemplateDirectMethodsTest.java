package com.nt.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("service",IEmployeeMgmtService.class);
		
		try {
			int count=service.fetchEmpsCount();
			System.out.println(count);
			System.out.println("--------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Map<String,Object> map=service.fetchEmployeeDetailsByEno(7499);
			System.out.println(map);
			System.out.println("--------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
		    List<Map<String,Object>> list=service.fetchEmployeeDetailsByDesgs("CLERK","MANAGER","SALESMAN");
		     /* list.forEach(map->{
			    	map.entrySet().forEach(row->{
			    		System.out.println(row.getKey()+"  "+row.getValue());
			    	});
			    	System.out.println("\n");
			    	          }); */ 	
			System.out.println(list);
			System.out.println("--------------------------------------------------");
		      
		}catch(Exception e) {
			e.printStackTrace();
		}
       ((AbstractApplicationContext) ctx).close();
       
	}

}
