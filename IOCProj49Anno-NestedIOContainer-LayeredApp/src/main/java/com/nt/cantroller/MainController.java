package com.nt.cantroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.IMgmtService;

@Controller("controller")
public class MainController {
	
	@Autowired
	private IMgmtService service;

	public List<EmployeeDto> showEmpsDesgs(String desg1, String desg2, String desg3) throws Exception{
		//use servise
		List<EmployeeDto> listDto=service.fetchEmpsByDesgs(desg1, desg2, desg3);
		return listDto;
		
	}
}
