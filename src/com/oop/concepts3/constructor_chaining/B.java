package com.oop.concepts3.constructor_chaining;

public class B extends A {
	{
		System.out.println("Nestatic bloc in B");
	}
	static {
		System.out.println("Static bloc in B");
	}

	public B() {
		System.out.println("constructor --> B");
		a-=3;
	}
	
	static void print() {
		System.out.println("static method B");
	}
}
