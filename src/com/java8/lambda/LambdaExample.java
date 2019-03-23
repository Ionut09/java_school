package com.java8.lambda;

import java.util.function.Supplier;

public class LambdaExample {

	public static void main(String[] args) {

		// animalTest e o interfata functionala
		AnimalTest test = new AnimalTest() {
			@Override
			public boolean test(Animal a) {
				return a.canHop();
			}
		};

		// boolean test(Animal a);
		AnimalTest lambdaTest = (Animal a) -> {
			return a.canHop();
		};
		AnimalTest lambdaTest2 = a -> a.canHop();

		Animal animalPasatCaParametru = new Animal();
		System.out.println("In main: " + lambdaTest.test(animalPasatCaParametru));

		Supplier<Animal> supplier = () -> new Animal();
		supplier.get();
	}
}
