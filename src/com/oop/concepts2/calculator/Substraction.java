package com.oop.concepts2.calculator;

public class Substraction implements Operation {

	@Override
	public void calculate(double a, double b) {
		System.out.println("Result of the substraction is: "+(a - b));
	}

	@Override
	public boolean match(String operator) {
		return "-".equals(operator);
	}

}
