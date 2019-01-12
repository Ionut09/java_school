package com.oop.concepts3.constructor_chaining;

public class A {
	protected static int a = 5;
	public final String d = "d din A";
	{
		System.out.println("Nestatic bloc in A");
		System.out.println(d);
		a++;
	}
	static {
		System.out.println("Static bloc in A");
		a+=2;
	}

	public A() {
		System.out.println("constructor --> A");
	}
	
	static void print() {
		System.out.println("static void A");
	}
}
