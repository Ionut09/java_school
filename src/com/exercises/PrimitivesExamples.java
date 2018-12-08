package com.exercises;

public class PrimitivesExamples {

	public static void main(String[] args) {
		int a = 5;
		long b = 8;
		long b2 = 8L;
		
		System.out.println(3/2); // 1
		System.out.println(3/2.0);//1.5
		System.out.println(3/2.0f);//1.5
		
		byte x1 = (byte) (5 + a);
		byte x2 = (byte) (5 + a);
		char ch = 'q';
		
		//short sum = 200555 + 3;
		int charSum = 'a' + 'b';
		System.out.println(charSum);
		
		long result = 2147483647 + 5L;
		System.out.println(result);
		
		float x3 = 5.6f;
	}
}
