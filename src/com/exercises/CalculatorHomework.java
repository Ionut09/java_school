package com.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.google.common.cache.Cache;

public class CalculatorHomework {
	
	public List<String> list;
	
    Cache clasaDinLibrarie;
    
	public static void main(String[] args) {
//		String operator = "*";
//		double a = 4, b = 2;
//		switch (operator) {
//		case "+":
//			calculateSum(a, b);
//			return;
//		case "-":
//			calculateDif(a, b);
//			return;
//		case "/":
//			calculateDiv(a, b);
//			return;
//		case "*":
//			calculateProd(a, b);
//			return;
//		}
//		System.out.println();
		
		List<String> list = new ArrayList<>();
		list.add("Dragos");
		list.add("Ana");
		list.add("Vlad");
		list.add("Ionut");
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("Ana e in clasa? \n " + (list.contains("Ana") ? "DA" : "NU"));
		
		System.out.println(list);
	}

	static double calculateSum(double a, double b) {
		if (a > b) {
			return b - 5;
		}
		throw new RuntimeException();
	}

	private static void calculateDiv(double a, double b) {
		double result = a / b;
		System.out.println(result);
	}

	private static void calculateProd(double a, double b) {
		double result = a * b;
		System.out.println(result);
	}

	private static void calculateDif(double a, double b) {
		double result = a - b;
		System.out.println(result);
	}
}
