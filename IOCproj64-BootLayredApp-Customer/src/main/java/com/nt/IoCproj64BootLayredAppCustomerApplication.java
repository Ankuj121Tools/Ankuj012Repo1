package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVo;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")

public class IoCproj64BootLayredAppCustomerApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(IoCproj64BootLayredAppCustomerApplication.class, args);
	
	try {
		//get contoller class obj
		BankController controller=ctx.getBean("controller",BankController.class);
		//prepare VO class obj
		CustomerVo custVO=new CustomerVo("ankuj","Bihar","10000","5","12");
		//invoke methods
		String result=controller.processCustomer(custVO);
		System.out.println("Intrest amount::"+result);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	//close container

	
	}

}
