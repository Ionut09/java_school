package com.oop.concepts.polimorphism;

public class Horse extends Animal {

	public Tiger sleep() {
		System.out.println("Horse sleeps standing!!!");
		return new Tiger();
	}

	public Horse() {
		super(12);
	}

	public Horse(int age) {
		super(age);
	}

}
