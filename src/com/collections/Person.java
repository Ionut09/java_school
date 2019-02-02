package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class Person {

	private String name;
	private String cnp;
	private int age;

	public Person(String name, String cnp, int age) {
		super();
		this.name = name;
		this.cnp = cnp;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", cnp=" + cnp + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cnp == null) ? 0 : cnp.hashCode());
//		return result;
		return (cnp == null) ? 0 : cnp.hashCode() * 31; // simplified

	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;

		if (this.cnp == null) {
			if (other.cnp != null) {
				return false;
			}
		} else if (!cnp.equals(other.cnp)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Student("Ion", "1273872138721", 20, "dwh"));
		list.add(new Student("Vasile", "1273872138721", 20, "altID"));
		list.add(new Employee("Costica", "8732847487", "empId"));
		list.add(new Employee("Vasilica", "78436422", "empId1"));

		// System.out.println(list.get(1));

		for (Person person : list) {
			// person.setName("RIca");
			System.out.println(person);
		}
		System.out.println(list.get(0).equals(list.get(1))); // true pt ca au acelasi cnp
		// contains foloseste equals si hashcode, tb sa le suprascriem pt o functionare
		// corecta
		System.out.println(list.contains(new Student("Vasile", "1273872138721", 20, "altID")));

		list.remove(0);

		for (Person person : list) {
			System.out.println(person);
		}

		list.remove(new Employee("Costica", "8732847487", "empId"));
		System.out.println();
		for (Person person : list) {
			System.out.println(person);
		}

		Predicate<Person> filter = new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getCnp().equals("1273872138721");
			}
		};
		Predicate<Person> filterLambda = (Person p) -> { 
			return p.getCnp().equals("1273872138721");
		};
		Predicate<Person> filterLambdaSimplified =  p -> p.getCnp().equals("1273872138721");
		//list.removeIf(filterLambdaSimplified);
		
		list.removeIf((Person p) -> p.getCnp().equals("1273872138721")); //pt ca o lambda expression poatefi pasata direct inline
		
	}

}
