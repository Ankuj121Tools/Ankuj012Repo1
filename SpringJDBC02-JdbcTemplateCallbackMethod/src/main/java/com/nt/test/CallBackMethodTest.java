package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.service.IEmployeeMgmtService;

public class CallBackMethodTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
		IEmployeeMgmtService service=ctx.getBean("service", EmployeeMgmtServiceImpl.class);
		
		try {
			List<EmployeeDTO> listDTO=service.fetchEmployeesByDesg("CLERK", "MANAGER", "SALESMAN");
			listDTO.forEach(System.out::println);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}

}
