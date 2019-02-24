package com.oop.concepts3;

import java.util.TreeSet;

public class Employee {

	private String name;
	TreeSet<String> set;

	public Employee(String name) {
		this.name = name;
	}

	public double calculatePay() {
		System.out.println("Calculate payment for an Employee in general!");
		return 100 * 10; // euro
	}
	
	public static void main(String[] args) {
		Employee emp =  new PartTimeEmployee("Vasilica");
		emp.calculatePay();
	}
}

class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String name) {
		super(name);
	}

	@Override
	public double calculatePay() {
		//double pay = super.calculatePay();
		System.out.println("Calculate payment for a part time Employee");
		return 100 - 10;
	}

	public double calculatePay(int rate) {
		System.out.println("Calculate payment for a  part time Employee with rate!");
		return this.calculatePay() - 10 * rate;
	}
}
