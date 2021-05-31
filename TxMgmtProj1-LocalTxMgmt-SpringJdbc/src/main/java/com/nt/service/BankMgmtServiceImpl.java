package com.nt.service;

import com.nt.dao.IBankDao;

public class BankMgmtServiceImpl implements IBankMgmtService {
   
	private IBankDao dao;
	
 public BankMgmtServiceImpl(IBankDao dao) {
		this.dao=dao;
	}
	
	
	@Override
	public String transferMoney(int sorc, int dest, double amt) throws RuntimeException {
        
		int count1=dao.withdraw(sorc,amt);
		int count2=dao.deposite(dest,amt);
		
		if(count1==0 || count2==0)
			throw new RuntimeException("TX rolled back --> Money is not Transfer");
		else	
		   return "TX Committed .. Money Transfared";
	}

}
