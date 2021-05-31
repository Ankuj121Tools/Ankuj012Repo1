package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.CustomerDto;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVo;

@Controller("controller")
public class BankController {
	@Autowired
	private ICustomerMgmtService service;
	 
	public BankController() {
	      System.out.println("0-param costructor is exicuted");
	}
	
	
	public  String   processCustomer(CustomerVo vo)throws Exception{
		CustomerDto dto=new CustomerDto();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
	
		String result=service.calculateSimpleIntrestAmount(dto);
		return result;
		
		
	}

}
