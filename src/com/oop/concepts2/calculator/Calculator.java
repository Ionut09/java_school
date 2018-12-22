package com.oop.concepts2.calculator;

public class Calculator {

//	private static Operation[] operations = {new Add(), 
//											 new Substraction(), 
//											 new Multiply(),
//											 new Divide()};
	
	//private static Operation[] operations = new Operation[] {}; // <==> cu new Operation[0];
	private static Operation[] operations = new Operation[4];
	
	
	public static void main(String[] args) {
		operations[0] = new Addition();
		operations[1] = new Substraction();
		operations[2] = new Multiplication();
		operations[3] = new Division();
		
		double a = Double.parseDouble(args[0]);
		String operator = args[1];
		double b = Double.parseDouble(args[2]);
		for (Operation op : operations) { 
			if(op.match(operator)) {
				op.calculate(a, b);
			}
		}
		
	}
}
