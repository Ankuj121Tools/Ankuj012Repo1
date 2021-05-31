package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDto;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
     
	private  ICustomerDao dao;
	public CustomerMgmtServiceImpl() {
		System.out.println("service");
	}
	public CustomerMgmtServiceImpl(ICustomerDao dao) {
		System.out.println("1-param");
		this.dao=dao;
	}
	
	@Override
	public String calculateSimpleIntrestAmount(CustomerDto dto) throws Exception {
		CustomerBo bo=new CustomerBo();
		float intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterest(intrAmt);
		int count=dao.insert(bo);
		return count==0?"Customer Registration failed":"Customer Registration Succeded:: Details are :: principlet amount::"+dto.getPamt()+"Time:: "+dto.getTime()+" rate::"+dto.getRate()+" Intrest amount:: "+intrAmt;
	}

}
