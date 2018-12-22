package com.oop.concepts2.object;

import com.oop.concepts1.polimorphism.Dog;
import com.oop.concepts2.calculator.Addition;

public class ObjectMethods {

	public static void main(String[] args) {
		System.out.println(new Addition());
		System.out.println(new Dog().equals(new Dog()));
		
		Dog dog1 = new Dog();
		Dog dog2 = dog1;
		
		System.out.println(dog1.equals(dog2));
		dog1.hashCode();
		
		Class<? extends Dog> class1 = dog1.getClass();
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getFields());
		System.out.println(class1.getSuperclass());
	
		
	}
	
}
