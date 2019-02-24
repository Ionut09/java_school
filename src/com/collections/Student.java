package com.collections;

public class Student extends Person {

	private String studentId;
	private int note;

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
		return super.toString() + " and [studentId=" + studentId + "]";
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		if (note < 1 || note > 10) {
			throw new IllegalArgumentException("The note should be in interval 1 - 10");
		}
		this.note = note;
	}
	
}
