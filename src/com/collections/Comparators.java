package com.collections;

import java.util.*;

public class Comparators {

	public static void main(String[] args) {
//		Set<Person> set = new TreeSet<>(new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
////				if (o1.getAge() < o2.getAge()) {
////					return -1;
////				} else if (o1.getAge() == o2.getAge()) {
////					return 0;
////				}
////				return 1;
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		Comparator<Person> lambdaComparator = (Person o1, Person o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Person> reversedComparator = lambdaComparator.reversed();
		
		Set<Person> set = new TreeSet<>(reversedComparator);
		set.add(new Employee("Adi", "192829292822", "Luxoft"));
		set.add(new Employee("Bogdan", "1983983892", "DB"));
		set.add(new Student("Andrei", "198398933", 25, "SIIT"));
		set.add(new Student("Andrei", "19839893399", 26, "Telacad"));
//		
		//  void accept(T t);
		set.forEach((Person p) -> System.out.println(p.getName()));
//		
//		Person p =  new Student("Andrei", "198398933", 26, "Telacad");
//		Comparable<Person> pers = (Comparable<Person>)p;
//		pers.compareTo(pers2);

	}

}
