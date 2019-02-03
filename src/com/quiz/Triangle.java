package com.quiz;
/**
 * Equilateral triangle
 * 
 * @author ionut.spalatelu
 *
 */
public class Triangle implements Shape {

	private double side;

	public Triangle(double side) {
		super();
		this.side = side;
	}

	@Override
	public double computePerimeter() {
		return side * 3; 
	}

	@Override
	public double computeArea() {
		return side * side * Math.sqrt(3) / 4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(side);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Triangle)) {
			return false;
		}
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side)) {
			return false;
		}
		return true;
	}

	
}
