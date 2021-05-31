package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.IEmployeeDao;
import com.nt.dto.EmployeeDto;
@Service("empService")
public class MgmtServiceImpl implements IMgmtService {
	
	@Autowired
	private IEmployeeDao dao;

	public List<EmployeeDto> fetchEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception{
		
		 //use Dao
		List<EmployeeBo> listBo=dao.getEmpsByDesgs(desg1, desg2, desg3);
		//convert list bo to list dto
		List<EmployeeDto> listDto=new ArrayList<EmployeeDto>();
         listBo.forEach(bo->{
        	   EmployeeDto dto=new EmployeeDto();
        	   BeanUtils.copyProperties(bo, dto);
        	   dto.setSerialno(listDto.size()+1);
        	   //add each Dto to ListDto
        	   listDto.add(dto);
         });
        	 
         
		return listDto;
	}

}
