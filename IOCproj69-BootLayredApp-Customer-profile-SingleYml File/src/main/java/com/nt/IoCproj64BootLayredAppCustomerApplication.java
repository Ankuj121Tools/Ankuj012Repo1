package com.nt;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVo;

@SpringBootApplication
public class IoCproj64BootLayredAppCustomerApplication {
	
	@Autowired
	private Environment env;

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
	System.out.println("active profile is ::"+Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
	
	//close container

	
	}

}
