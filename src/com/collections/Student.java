package com.collections;

public class Student extends Person {

	private String studentId;

	public Student(String name, String cnp, int age, String studetnID) {
		super(name, cnp, age);
		this.studentId = studetnID;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return super.toString()+ " and [studentId=" + studentId + "]";
	}
	
	

}
