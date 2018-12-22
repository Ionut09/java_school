package com.oop.concepts1.polimorphism;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog barks!!!");
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalize have been called!!");
	}

	@Override
	public Animal sleep() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
