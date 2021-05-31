package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringJdbc04JdbcTemplateCallbackMethodsBootApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringJdbc04JdbcTemplateCallbackMethodsBootApplication.class, args);
	
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


