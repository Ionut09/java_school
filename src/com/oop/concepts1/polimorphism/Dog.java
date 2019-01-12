package com.oop.concepts1.polimorphism;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog barks!!!");
	}

	public Dog() {
		super();
	}

	public Dog(int age) {
		super(age);
	}
	
	public Dog(String name) {
		super();
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalize have been called!!");
	}

	@Override
	public Animal sleep() {
		new Dog() {
			public void bark() {
			}	
		};
		return null;
	}

	
	
}
