package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component("blicReplacer")
public class BankLoanIntrestCalucatorReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankLoanIntrestCalucatorReplacer.reimplement()::(SimpleIntrest)");
		
		float pAmt=(Float) args[0];
		float rate=(Float) args[1];
		float time=(Float) args[2];
		
		return (pAmt*rate*time)/100.0f;
	}

}
