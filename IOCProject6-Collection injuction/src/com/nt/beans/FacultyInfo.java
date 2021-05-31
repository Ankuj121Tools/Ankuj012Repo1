package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class FacultyInfo {
      private Set<Long> phoneNum;
      private Set<Date> date;
	
      public void setPhoneNum(Set<Long> phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setDate(Set<Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "FacultyInfo [phoneNum=" + phoneNum + ", date=" + date + "]"+phoneNum.getClass();
	}
      
      
}
