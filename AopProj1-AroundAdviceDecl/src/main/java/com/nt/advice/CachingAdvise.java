package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CachingAdvise{
	
	private Map<String,Object> cacheMap=new HashMap<>();
	
	public Object caching(ProceedingJoinPoint pjp) throws Throwable
	{
      String key=pjp.getSignature()+Arrays.deepToString(pjp.getArgs());
      Object retVal=null;
      if(!cacheMap.containsKey(key))
      {
    	  retVal=pjp.proceed();
    	  cacheMap.put(key,retVal);
    	  return retVal;
      }else 
      {
    	retVal=cacheMap.get(key);
    	return retVal;
      }
	
	}
}
