package com.nt.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
    private Integer serialno;
	private Integer empno;
	private String ename;
	private String job;
	private Float sal;
	private Integer deptno;
	
	public Integer getSerialno() {
		return serialno;
	}
	public Integer getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public Float getSal() {
		return sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setSerialno(Integer serialno) {
		this.serialno = serialno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
}
