package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IBankDao;

@Service("bankService")
public class BankMgmtServiceImpl implements IBankMgmtService {
   
	@Autowired
	private IBankDao dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String transferMoney(int sorc, int dest, double amt) throws RuntimeException {
        
		int count1=dao.withdraw(sorc,amt);
		int count2=dao.deposite(dest,amt);
		
		if(count1==0 || count2==0)
			throw new RuntimeException("TX rolled back --> Money is not Transfer");
		else	
		   return "TX Committed .. Money Transfared";
	}

}
