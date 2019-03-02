package com.io;

import java.io.Serializable;

public class Elev implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	
	
	public Elev(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Elev [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public String toJson() {
		return " { name : " + name+",\n"
				+ "   age : " + age + ",\n"
				+ "   gender : " + gender+"\n"
				+ " }\n";
	}
	

}
