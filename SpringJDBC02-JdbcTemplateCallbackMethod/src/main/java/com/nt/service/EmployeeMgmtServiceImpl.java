package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.BeanDefinitionDsl.BeanSupplierContext;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDao;
import com.nt.dto.EmployeeDTO;
@Service("service")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
     
	@Autowired
	@Qualifier(value="employeeDao4")
	private IEmployeeDao dao;
	@Override
	public EmployeeDTO fetchEmployeeByNo(int eno) {
		EmployeeBO bo=dao.getEmployeeByNo(eno);
		EmployeeDTO dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}
	@Override
	public List<EmployeeDTO> fetchEmployeesByDesg(String desg1, String desg2, String desg3) {
		List<EmployeeBO> listBo=dao.getEmployeesByDesgs(desg1, desg2, desg3);
		List<EmployeeDTO> listDto=new ArrayList<EmployeeDTO>();
		listBo.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});
		return listDto;
	}

}
