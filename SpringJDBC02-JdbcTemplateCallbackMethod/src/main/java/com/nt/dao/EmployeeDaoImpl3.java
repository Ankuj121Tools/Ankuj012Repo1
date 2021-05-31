package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("employeeDao3")
public class EmployeeDaoImpl3 implements IEmployeeDao {

    private static final String   GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";

	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		System.out.println("lamda");
		EmployeeBO bo=jt.queryForObject(GET_EMP_BY_ENO, (rs,rowNum)->{
			                                                          EmployeeBO bo1=new EmployeeBO();
			                                        				  bo1.setEmpNo(rs.getInt(1));
			                                        				  bo1.setEname(rs.getString(2));
			                                        				  bo1.setJob(rs.getString(3));
			                                        				  bo1.setSal(rs.getFloat(4));
			                                                          return bo1;
		                                                             }, eno);
		return bo;
	}

	@Override
	public List<EmployeeBO> getEmployeesByDesgs(String desg1, String desg2, String desg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
