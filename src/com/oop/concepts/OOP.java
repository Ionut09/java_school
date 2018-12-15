package com.oop.concepts;

public class OOP {
	
	public static void main(String[] args) {
		Car carObject = new Car();
		
		Color black = new Color();
		Car carObject2 = new Car(50.3f, (byte)4, 100.5f, black);
		
		carObject.accelerate();
	}
	
}
