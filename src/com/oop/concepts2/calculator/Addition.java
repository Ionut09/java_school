package com.oop.concepts2.calculator;

public class Addition implements Operation {

	@Override
	public void calculate(double a, double b) {
		System.out.println("Result of the addition is: "+(a + b));
	}

	@Override
	public boolean match(String operator) {
		boolean match = "+".equals(operator);
		return match;
	}
	
	@Override
	public String toString() {
		return "Addition [ methods : match, calculate ]";
	}

}
