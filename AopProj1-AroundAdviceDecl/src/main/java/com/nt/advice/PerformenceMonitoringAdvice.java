package com.nt.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformenceMonitoringAdvice {
	
	
	public Object performence(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("PerformenceMonitoringAdvice.performence()-(before entring)");
		long start=System.currentTimeMillis();
		Object rt=pjp.proceed();
		System.out.println("PerformenceMonitoringAdvice.performence()-(after Entering)");
		long end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" Take "+(end-start)+"ms");
		return rt;
	}

}
