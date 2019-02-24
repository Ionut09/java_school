package com.oop.concepts3.anonimous;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.oop.concepts3.Employee;

public class Playground {

	static interface Interface{
		void run2();
	}
	static class Example{
		void run2() {
		System.out.println("running");	
		}
	}
	public static void main(String[] args) {
		Interface ref = new Interface() {
			public void run2() {
				System.out.println("running");
			}
		};
		//ref.run2();
		
		Example obj = new Example();
		obj.run2();
		Example obj1 = new Example() {
			void run2() {}
		} ;
		
		Comparator<Employee> empComparator = new EmpComparator();
		Set<Employee> set = new TreeSet<>(empComparator);
//		Set<Employee> set = new TreeSet<>(new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				//logic for compare
//				return 0;
//			}
//		});
		obj1.run2();
	}
}
