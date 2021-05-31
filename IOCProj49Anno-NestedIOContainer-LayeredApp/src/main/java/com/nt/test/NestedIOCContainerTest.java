package com.nt.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.cantroller.MainController;
import com.nt.dto.EmployeeDto;

public class NestedIOCContainerTest {

	public static void main(String[] args) {
		
		//create parent IOCContainer
		ApplicationContext pctx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create child IOCContainer
		ApplicationContext cctx=new ClassPathXmlApplicationContext(new String[]{"com/nt/cfgs/presentation-beans.xml"},pctx);
		//get controller class object
		MainController controller=cctx.getBean("controller",MainController.class);
		List<EmployeeDto> listDto=null;
		
	   try{
		 listDto=controller.showEmpsDesgs("CLERK", "MANAGER","SALESMAN");
		 listDto.forEach(dto->{
			 System.out.println(dto);
		 });
	   }
		catch(Exception e){
			e.printStackTrace();
		}
	   //close container
	   ((AbstractApplicationContext) pctx).close();
	   ((AbstractApplicationContext) cctx).close();

	}

}
