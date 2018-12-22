package com.oop.concepts1;

public class Car {

	private float fuelLevel; // 0.0f
	private byte gear; // 0
	private float speed; // 0.0f
	private Color color; // null

	public Car() {

//		System.out.println("" + fuelLevel + gear + speed + color); error, this must the first statement
		this(20.0f,  1, 50f, new Color());
		System.out.println("" + fuelLevel + gear + speed + color); //error, this must the first statement
	}

	public Car(float fuel, byte gear, float speed, Color color) {
		fuelLevel = fuel;
		this.gear = gear;
		this.speed = speed;
		this.color = color;
	}

	public Car(float fuel, int gear, float speed, Color color) {
		fuelLevel = fuel;
		this.gear = (byte) gear;
		this.speed = speed;
		this.color = color;
	}

	public void accelerate() {
	}

	public void steer() {
	}

	public void gearUp() {
	}

	public void gearDown() {
	}

}
