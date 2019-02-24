package com.oop.concepts2.calculator;

public class Division implements Operation {

	@Override
	public void calculate(double a, double b) {
		System.out.println("Result of the division is: "+a/b);
	}
	
	public static void main(String[] args) {
		//oricand nu suntem  siguri de o chestie bagam un main 
		//si testam ce se intampla
		double a=4, b=2;
		System.out.println("Result of the division is: "+a / b);
	}

	@Override
	public boolean match(String operator) {
		return "/".equals(operator);
	}

}
