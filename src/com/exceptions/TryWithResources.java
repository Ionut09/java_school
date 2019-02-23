package com.exceptions;

import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {

		methodWhichCallsAnptherDangerousMethod();
		System.out.println("Try-with-resources example:");
		try (BufferedReader r = new BufferedReader(new FileReader(
				"C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace\\GitProject\\java_school\\src\\com\\exceptions\\text.txt"))) {
			String firstLine = r.readLine();
			System.out.println(firstLine);
		} catch (IOException e) {
			System.out.println("Cannot read first line from text.txt: " + e.getMessage());
			// firstLine = ""; is not visible here
		}

	}

	static double circleArea(double radius) throws Exception {
		if (radius < 0) {
			throw new Exception("radius should be positive");
		}
		return Math.PI * radius * radius;
	}

	private static void methodWhichCallsAnptherDangerousMethod() { // throws Exception {
		try {
			double area = circleArea(-2); // Alt+Shift+L dupa ce selectam expresia--> extract local variable
		} catch (Exception e) {
			System.out.println("Am apelat metoda cu un numar negativ");
			e.printStackTrace();
		} 
	}

}
