package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dto.EmployeeDTO;

public interface IEmployeeDao {
	public  EmployeeBO  getEmployeeByNo(int eno);
	public   List<EmployeeBO>  getEmployeesByDesgs(String desg1,String desg2,String desg3);
	
}
