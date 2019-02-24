package com.collections;

import static java.util.Collections.sort;

import java.util.*;
import java.util.stream.Stream;


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

		
		List<Person> personList = new ArrayList<>();
		personList.add(new Employee("Adi", "192829292822", "Luxoft"));
		personList.add(new Employee("Bogdan", "1983983892", "DB"));
		personList.add(new Student("Andrei", "198398933", 25, "SIIT"));
		personList.add(new Student("Mihai", "19839893399", 26, "Telacad"));
		
		//public int compare(Person o1, Person o2) 
		//Comparator<Person> nameComparator = (Person o1, Person o2) -> {return o1.getName().compareTo(o2.getName());};
		Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
		sort(personList);
		//sort(personList, nameComparator);
		
		personList.forEach((Person person) -> System.out.println("--> "+person));
		
		Person[] personArray = personList.toArray(new Person[4]);
		Arrays.sort(personArray, nameComparator);
		
		Stream.of(personArray).forEach((Person person) -> System.out.println("==> "+person));
		//nameComparator.thenComparing(other)
	}

}
