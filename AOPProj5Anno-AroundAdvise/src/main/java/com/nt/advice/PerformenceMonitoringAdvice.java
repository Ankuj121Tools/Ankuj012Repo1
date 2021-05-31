package com.nt.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
@Aspect
@Order(1)
public class PerformenceMonitoringAdvice {
	
	@Around(value="execution(double com.nt.service.BankService.calc*(..))")
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
