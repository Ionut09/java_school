package com.oop.concepts1.polimorphism;

public abstract class Animal {

	private int age;

	public Animal(int age) {
		this.age = age;
	}

	public Animal() {
	}

	public void eats() {
		System.out.println("Animal eats!!!");
	}
	
	public abstract Animal sleep();

	public void sleep(Animal a) throws ArithmeticException {
		// System.out.println(a.sleep(a));
	}

	public int getAge() {
		return age;
	}

	public Animal setAge(int age) {
		this.age = age;
		return this;
	}

}
