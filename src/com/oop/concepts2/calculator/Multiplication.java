package com.oop.concepts2.calculator;

public class Multiplication implements Operation {

	@Override
	public void calculate(double a, double b) {
		System.out.println("Result of the multiplication is: "+a*b);
	}

	@Override
	public boolean match(String operator) {
		return "*".equals(operator);
	}

}
