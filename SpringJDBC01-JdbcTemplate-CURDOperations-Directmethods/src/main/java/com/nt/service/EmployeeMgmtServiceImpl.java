package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.IEmployeeDao;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
 
	private IEmployeeDao dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDao dao)
	{
		this.dao=dao;
	}
	
	@Override
	public int fetchEmpsCount() {
		int count=dao.getEmployeesCount();
		return count;
	}
	
	@Override
	public Map<String, Object> fetchEmployeeDetailsByEno(int eno) {
		Map<String, Object> map=dao.getEmployeeDetailsByEno(eno);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> fetchEmployeeDetailsByDesgs(String desg1, String desg2, String desg3) {
		List<Map<String, Object>> list=dao.getEmployeeDetailsByDesgs(desg1, desg2, desg3);
		return list;
	}

}
