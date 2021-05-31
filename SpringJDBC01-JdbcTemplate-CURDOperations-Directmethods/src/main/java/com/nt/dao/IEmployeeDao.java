package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	 public  int  getEmployeesCount();
	 public  Map<String,Object> getEmployeeDetailsByEno(int eno);
	 public List<Map<String,Object>> getEmployeeDetailsByDesgs(String desg1,String desg2,String desg3);

}
