package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class FruitStore {
    
	private Map<String,Float> fruitsinfo;
	private Map<String,Date>  impDates;
	
	public void setFruitsinfo(Map<String, Float> fruitsinfo) {
		this.fruitsinfo = fruitsinfo;
	}
	public void setImpDates(Map<String, Date> impDates) {
		this.impDates = impDates;
	}
	@Override
	public String toString() {
		return "FruitStore [fruitsinfo=" + fruitsinfo + ", impDates=" + impDates + "]"+fruitsinfo.getClass();
	}
	
	
	
	
	
}
