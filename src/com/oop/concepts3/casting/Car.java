package com.oop.concepts3.casting;

public class Car {

	private int maxSpeed;
	private String type;

	public Car(int maxSpeed, String type) {
		super();
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	public static void main(String[] args) {
		Car c1 = new Car(200, "BMW");
		Car c2 = new Car(200, "BMW");
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1 + "\n" + c2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxSpeed;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car objCasted = (Car) obj;
		if (this.maxSpeed != objCasted.maxSpeed)
			return false;
		if (type == null) {
			if (objCasted.type != null)
				return false;
		} else if (!type.equals(objCasted.type))
			return false;
		return true;
	}

}
