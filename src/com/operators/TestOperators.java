package com.operators;

public class TestOperators {

	public static void main(String args[]) {
		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		System.out.println("a in base 2: " + Integer.toBinaryString(a));
		System.out.println("b in base 2: " + Integer.toBinaryString(b));
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c + " --> " + Integer.toBinaryString(c));

		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c + " --> " + Integer.toBinaryString(c));

		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c + " --> " + Integer.toBinaryString(c));

		c = ~0b00111100; /*-61 = 1100 0011 */
		System.out.println("~a = " + c + "\n c --> " + Integer.toBinaryString(c));

		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c + " --> " + Integer.toBinaryString(c));

		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2  = " + c + " --> " + Integer.toBinaryString(c));

		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c + " --> " + Integer.toBinaryString(c));
		long an;
		long an_1;
		long an_2;
		long currentTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < 40; i++) {
			System.out.println(fibonacciWithVariables(i) + ", ");
		}
		System.out.println("Total time=" + (System.currentTimeMillis() - currentTimeMillis));
	}

	static long fibonacciRecursive(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	static int factorial(int n)
	{
	    if (n == 1)
	        return 1;
	    else
	        return (n*(factorial(n-1)));
	}
	static long fibonacciWithVariables(long n) {
		if (n <= 1) {
			return n;
		}
		long x = 0, y = 1;
		long ans = 0;
		for (int i = 2; i <= n; i++) {
			ans = x + y;
			x = y;
			y = ans;
		}
		return ans;
	}

}
