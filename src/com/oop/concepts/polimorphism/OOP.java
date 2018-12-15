package com.oop.concepts.polimorphism;

public class OOP {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		Horse horse = new Horse();
		
		Animal[] animals = {tiger, dog, horse, horse};
		
		Tiger animalushel = (Tiger)animals[1];
		animalushel.eats();
		
		Animal[] animalute = new Animal[]{};
		//Variable must provide either dimension expressions or an array initializer
		Animal[] animalutez = new Animal[5]; 
		
		Animal animal = new Tiger();
//		Animal animal = new Animal();
		Animal animalHorse = new Horse();
		
		//animalHorse.eats();
		
		
		
		
		
		
		System.out.println("Animale din array:--->\n");
//		for (Animal animalush : animals) {
//			animalush.eats();
//			System.out.println();
//		}
		
		Animal dogSetAge = dog.setAge(14);
		System.out.println(dogSetAge.getAge());
		
		dogSetAge.setAge(20);
		System.out.println(dogSetAge.getAge());
		
		Animal ref1 = dog;
		Animal ref2 = dog;
		Animal ref3 = dog;
		Animal ref4 = dog;
		
		System.out.println(ref1.getAge());
		System.out.println(ref2.getAge());
		System.out.println(ref3.getAge());
		System.out.println(ref4.getAge());
		
		//Animal anim = new Animal();
		//is abstract, so it cannot be instantiated
	}
}
