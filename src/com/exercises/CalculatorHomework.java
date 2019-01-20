package com.exercises;

import java.util.*;
public class CalculatorHomework {

	public List<String> list;

	public double calculate(double a, double b, String operator) {
		switch (operator) {
		case "+":
			return calculateSum(a, b);
		case "-":
			return calculateDif(a, b);
		case "/":
			return calculateDiv(a, b);
		case "*":
			return calculateProd(a, b);
		default:
			System.out.println("Invalid operator");
			throw new RuntimeException();
		}
	}

//		List<String> list = new ArrayList<>();
//		list.add("Dragos");
//		list.add("Ana");
//		list.add("Vlad");
//		list.add("Ionut");
//		
//		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println("Ana e in clasa? \n " + (list.contains("Ana") ? "DA" : "NU"));
//		
//		System.out.println(list);
	

	static double calculateSum(double a, double b) {
		double result = a + b;
		return result;

	}

	private static double calculateDiv(double a, double b) {
		double result = a / b;
		System.out.println(result);
		return result;
	}

	private static double calculateProd(double a, double b) {
		double result = a * b;
		System.out.println(result);
		return result;

	}

	private static double calculateDif(double a, double b) {
		double result = a - b;
		System.out.println(result);
		return result;

	}
}
