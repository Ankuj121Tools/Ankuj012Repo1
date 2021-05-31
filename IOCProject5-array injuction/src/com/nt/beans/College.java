package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class College {

	private String favStudent[];
	private Date date[];
	
	public void setFavStudent(String[] favStudent) {
		this.favStudent = favStudent;
	}
	public void setDate(Date[] date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "College [favStudent=" + Arrays.toString(favStudent) + ", date=" + Arrays.toString(date) + "]";
	}
	
	
}
