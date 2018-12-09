package com.exercises;

import java.util.Scanner;
/**
 * In clasa Main se gasesc mai multe exercitii introductive
 * @author Ionut Spalatelu
 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	/*
	 * Asta e un comentariu pe mai multe linii
	 * 
	 */

	private static void readNumbers() {
		int number;
		String s = "";
		s.charAt(3);
		do {
			System.out.println("Introduceti numarul: ");
			number = sc.nextInt();
			System.out.println("Ati introdus numarul: "+number);
		} while(number % 2 != 0);
		System.out.println("ATi introdus un numar par, programul se va incheia!");
		
	}
	private static long calculateFactorialCuWhile(int n) {
		long factorial = 1;
		int i = 1;
		while(i<=n) {
			factorial = factorial*i;
			System.out.println("Acum i = " + i);
			i++;
		}
		return factorial;
		
	}
	private static long calculateFactorial(int n) {
		long factorial = 1L;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial*i;
			System.out.println("Acum i = " + i);
		}
		return factorial;
	}
	private static long calculateFactorialCuIf(int n) {
		long factorial = 1L;
		
		for (int i = 1; i <= n; i++) {
			if(i%2 == 0) {
				factorial = factorial * i;
			}
			System.out.println("Acum i = " + i);
		}
		return factorial;
	}
	private static long calculateFactorialCuIncrement2(int n) {
		long factorial = 1L;
		for (int i = 2; i <= n; i = i+2) {
			factorial = factorial*i;
			System.out.println("Acum i = " + i);
		}
		return factorial;
	}
	
	/**
	 * @author ionut.spalatelu
	 * @param 
	 * @r
	 */
	private static void testForEach() {
		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;
		for (int x : numbers) {
			if (x == 40) {
				System.out.println(x + "-->ignorat din cauza lui continue");
				continue;
			}
			sum += x;
			System.out.println(x +"--> INtra la suma");
			if (sum > 100) {
				break;
			}
		}
		System.out.print("sum: " + sum);
	}
	public static void main(String[] args) {
		testForEach();
	}
	
	
	
	
	
	
	
}
