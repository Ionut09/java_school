package com.collections;

import java.util.*;

public class SetExercises {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Employee("Adi", "192829292822", "Luxoft"));
		set.add(new Employee("Bogdan", "1983983892", "DB"));
		set.add(new Student("Andrei", "198398933", 25, "SIIT"));
		set.add(new Student("Andrei", "198398933", 26, "Telacad"));

		
		set.forEach(p -> System.out.println(p.getName()));
		
		boolean isIn = set.contains(new Student("Mihai", "198398933", 26, "Telacad"));
		System.out.println(isIn+"\n\n");
		System.out.println(set.toString());
		set.isEmpty();
	}

}
