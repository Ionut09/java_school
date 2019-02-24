package com.oop.concepts1.polimorphism;

public class Horse extends Animal {

	public Horse sleep() {
		System.out.println("Horse sleeps standing!!!");
		return new Horse();
	}

	public Horse() {
		super(12);
	}

	public Horse(int age) {
		super(age);
	}

}
