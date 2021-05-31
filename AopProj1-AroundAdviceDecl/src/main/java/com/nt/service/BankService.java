package com.nt.service;

public class BankService {
	
	public double calcSimpleIntrestAmt(float pAmt, float rate,float time)
	{
		System.out.println("BankService.CalcSimpleIntrestamount()");
		return (pAmt*rate*time)/100.0f;
	}
	
	public double calcCompoundIntrestAmt(float pAmt, float rate,float time)
	{
		System.out.println("BankService.calcCompoundIntrestAmt()");
		return (pAmt*Math.pow(1+rate/100,time))-pAmt;
	}

}
