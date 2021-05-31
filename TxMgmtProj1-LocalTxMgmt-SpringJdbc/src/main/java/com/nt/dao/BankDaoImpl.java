package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements IBankDao{
	
	private static final String  BANK_WITHDRAW="UPDATE SPRING_TX_BANK SET BALANCE=BALANCE-? WHERE ACCNO=?";
	private static final String  BANK_DEPOSITE="UPDATE SPRING_TX_BANK SET BALANCE=BALANCE+? WHERE ACCNO=?";
	
	private  JdbcTemplate jt;
	
    public BankDaoImpl(JdbcTemplate jt) {
		this.jt=jt;
	}

	@Override
	public int withdraw(int srcAcno, double amt) {
		int count=jt.update(BANK_WITHDRAW,amt,srcAcno);
		return count;
	}
	
	@Override
	public int deposite(int destAcno, double amt) {
		int count=jt.update(BANK_DEPOSITE,amt,destAcno);
		return count;
	}

}
