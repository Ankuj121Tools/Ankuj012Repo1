package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("employeeDao1")
public class EmployeeDaoImpl1 implements IEmployeeDao {

	private static final String   GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		System.out.println("Inner Class");
		EmployeeBO bo=jt.queryForObject(GET_EMP_BY_ENO,new EmployeeRowMapper() , eno);
		
		return bo;
		
	}
	//Inner Class
	private static class  EmployeeRowMapper implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBO bo=new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			return bo;
		}//end of method 
		
	}// end of inner class
	@Override
	public List<EmployeeBO> getEmployeesByDesgs(String desg1, String desg2, String desg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
