package com.oop.concepts2.static_keyword;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name = "Bobitza";
	List<String> list = new ArrayList<>();
	static final String BADGE = "OCP"; // constanta
	final int badgeNumber = 32;
	//unei varibile final trebuie sa-i asigna, o valoare in place 
	//sau in constructor
	
	public Person(String name) {
		this.name = name;
		toString();
	}
//	public Person(String name, int badgeNumber) {
//		this.badgeNumber = badgeNumber;
//		this.name = name;
//		toString();
//	}
	public Person() {
		this("no name");
	}
	
	public Person methodWhichReturnsTheCallerObject() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		//e echivalent cu Person p = new Person("no name");
	
		Person p1 = p.methodWhichReturnsTheCallerObject();
		System.out.println(p1==p);
		System.out.println(p1);
		System.out.println(p);
	}
}
