package com.nt.beans;

public class BankLoanIntrestcalculator {
	
	public float calculateIntrestAmount(float pAmt,float rate,float time) {
		System.out.println("BankLoanIntrestcalculator.calculateIntrestAmount(_,_,_)::(compoundIntrest)");
		
		return (float) (pAmt*Math.pow((1+(rate/100)),time))-pAmt;
	}

}
