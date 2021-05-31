package com.nt.beans;


import java.util.Date;
import java.util.List;

public class Student{

	private List<Integer> marks;	
	private List<Date> date;
	
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public void setDate(List<Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", date=" + date + "]"+marks.getClass();
	}
	
	
	
}
