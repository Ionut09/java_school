package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.collections.Student;

public class TryCatchFinally {
	public static void main(String[] args) {
		Student student = new Student("Ion", "98398273", 21, "");
		try {
			// asta e codul periculosss
			// student.setNote(-2);
			int a = 3 / 0; // java.lang.ArithmeticException: / by zero
		} catch (IllegalArgumentException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage() + " Aici prindem tot ce zboara");
		}
		System.out.println("Sunt dupa catch :D :P ");
//		int[] b = new int[0];
//		b[0] = 2;

		System.out.println("\n\n\n Finally example:");
		try {
			System.out.println("Code before exception is thrown");
			int a = 3 / 0; // java.lang.ArithmeticException: / by zero
			System.out.println("Code after exception is thrown");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} finally {
			// Executes every time even if an exception is thrown
			System.out.println("I'm in finally block");
		}

	}
}
