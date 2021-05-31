package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBo;

@Repository("custdao")
@Profile({"dev","prod"})
public class OracleCustomerDaoImpl implements ICustomerDao {
	private static final String  INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMER_DETAIL VALUES(SEQ_1.NEXTVAL,?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds=null;
	
	public OracleCustomerDaoImpl() {
		System.out.println("dao");
	}
	
	
     public int insert(CustomerBo bo) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		ps.setString(1,bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3,bo.getPamt());
		ps.setFloat(4,bo.getRate());
		ps.setFloat(5,bo.getTime());
		ps.setFloat(6,bo.getInterest());
		int count=ps.executeUpdate();
		con.close();
		ps.close();
		return count;
	}

}
