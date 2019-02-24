package com.collections;

public class Employee extends Person{

	public Employee(String name, String cnp, String empId) {
		super(name, cnp, (byte)30);
		this.empId=empId;
	}

	private String empId;

	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return super.toString()+ " and [empId=" + empId + "]";
	}
	
	
	
	
}
