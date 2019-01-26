package com.oop.references;

import com.oop.concepts1.Car;
import com.oop.concepts1.Color;

public class PassByValueVsPassByReference {

	public static void main(String[] args) {
		PassByValueVsPassByReference obj = new PassByValueVsPassByReference();
		int a = 10;
		int b = obj.passByValue(a);
		System.out.println("a= " + a + ",  b= " + b);

		Car car = new Car();
		car.setColor(new Color("green"));
		obj.passByReference(car);
		System.out.println(car.toString());

		Integer i = 8;
		String str = "Ciprian";
		obj.passByReferenceImmutableObj(i, str);
		System.out.println(i + ",   " + str + " after method call");
	}

	private int passByValue(int a) {
		a += 5;
		return a;
	}

	private void passByReference(Car carRef) {
		carRef = new Car();
		carRef.setColor(new Color("red"));
	}

	private void passByReferenceImmutableObj(Integer i, String str) {
		i++;
		str = str.toUpperCase();
		System.out.println(i + ",   " + str +" inside method");
	}
}
