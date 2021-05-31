package com.nt.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeMgmtService {
	 public int fetchEmpsCount();
	 public Map<String,Object> fetchEmployeeDetailsByEno(int eno);
	 public  List<Map<String,Object>> fetchEmployeeDetailsByDesgs(String desg1,String desg2,String desg3);

}
