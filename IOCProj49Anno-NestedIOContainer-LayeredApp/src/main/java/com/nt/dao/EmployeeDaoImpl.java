package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private DataSource ds;
	
    private static final String SELECT_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE IN(?,?,?) ORDER BY JOB";
    
    public List<EmployeeBo> getEmpsByDesgs(String desg1, String desg2, String desg3)throws Exception {
    	List<EmployeeBo> listbo=null;
    	try (Connection con=ds.getConnection();
			  PreparedStatement ps=con.prepareStatement(SELECT_QUERY)){
			ps.setString(1,desg1);
			ps.setString(2,desg2);
			ps.setString(3,desg3);
			try(ResultSet rs=ps.executeQuery()){
				listbo=new ArrayList<EmployeeBo>();
                 while(rs.next()) {
                	 EmployeeBo bo=new EmployeeBo();
                	 bo.setEmpno(rs.getInt(1));
                	 bo.setEname(rs.getString(2));
                	 bo.setJob(rs.getString(3));
                	 bo.setSal(rs.getFloat(4));
                	 bo.setDeptno(rs.getInt(5));
                	 listbo.add(bo);
                 }//while
			}//try2
			
		}//try1
    	catch(SQLException se) {
    		se.printStackTrace();
    		throw se;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		throw e;
    	}
		return listbo;
	}

}
