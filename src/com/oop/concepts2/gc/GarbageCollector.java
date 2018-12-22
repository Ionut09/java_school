package com.oop.concepts2.gc;

import com.oop.concepts1.polimorphism.Dog;

public class GarbageCollector {

	public static void main(String[] args) throws Throwable {
		Dog dog1 = new Dog("Max");
		Dog dog2 = dog1; 
		
		dog1 = new Dog("Zdreanta");
		//Max inca nu e eligibil pentru GC, pentru ca dog2 inca face referire catre el
		
		dog2 = new Dog();
		//Max e eligibil pentru GC, insa nu e sters in acest moment
		//ci cand vrea Garbage Collectorul, cand vrea muschiul lui
		
		//nici macar daca fac asta....
		dog1.finalize();
		System.out.println("dog1 --> " + dog1);
		dog1 = dog2;
		
		System.out.println("a" + 2);
		System.out.println((char)('a' + 2));
		
	}
}
