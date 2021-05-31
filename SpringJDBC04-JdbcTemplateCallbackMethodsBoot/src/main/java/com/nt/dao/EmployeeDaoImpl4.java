package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("employeeDao4")
public class EmployeeDaoImpl4 implements IEmployeeDao {
    
	private static final String  GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeBO> getEmployeesByDesgs(String desg1, String desg2, String desg3) {
		
		List<EmployeeBO> bo1=(List<EmployeeBO>) jt.query(GET_EMPS_BY_DESG, rs->{

			
			                                                              List<EmployeeBO> al=new ArrayList<EmployeeBO>();
			                                                                  while(rs.next()) {
			    	                                                            EmployeeBO bo=new EmployeeBO();
			                                                                	bo.setEmpNo(rs.getInt(1));
			    	                                                            bo.setEname(rs.getString(2));
			    	                                                            bo.setJob(rs.getString(3));
			    	                                                            bo.setSal(rs.getFloat(4));
			    	                                                            al.add(bo);
			                                                                  }//close While
				                                                              return al;
			                                                                 }//close Lamda
			
		                                                                  ,desg1,desg2,desg3);
		return bo1;
	}

}
