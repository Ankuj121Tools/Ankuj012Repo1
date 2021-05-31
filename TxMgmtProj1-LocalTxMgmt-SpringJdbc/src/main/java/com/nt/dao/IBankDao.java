package com.nt.dao;

public interface IBankDao {
   
	public int deposite(int destAcno,double amt);
	public int withdraw(int srcAcno,double amt);
}
