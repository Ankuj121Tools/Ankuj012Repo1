package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDao {
   
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_DETTAILS_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETTAILS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	private JdbcTemplate jt;
	
	public EmployeeDaoImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDaoImpl-1-param constructor ");
		this.jt=jt;
	}
	
	@Override
	public int getEmployeesCount() {
		int count=jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}
	
	@Override
	public Map<String, Object> getEmployeeDetailsByEno(int eno) {
	    Map<String,Object> map=jt.queryForMap(GET_EMP_DETTAILS_BY_EMPNO,eno);
		return map;
	}
	
	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDesgs(String desg1, String desg2, String desg3) {
		List<Map<String, Object>> list=jt.queryForList(GET_EMP_DETTAILS_BY_DESGS, desg1,desg2,desg2);
		return list;
	}

}
