package com.oop.concepts1.polimorphism;


public class Tiger extends Animal {

	public void eats() {
		super.eats();
		System.out.println("Tiger eats!!!");
	}

	@Override
	public Animal sleep() {
		// TODO Auto-generated method stub
		return null;
	}

}
