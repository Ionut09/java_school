package com.oop.concepts2.static_keyword;

public class RomanianPerson {

	 private String firstName;
	 private String lastName;
	 private static String nationality;
	 private static int counter;
	
	 public RomanianPerson(String firstName, String lastName) {
		super();
		counter++; //sau ++ counter; sau counter = counter + 1; alta alternativa counter+=1; 
		this.firstName = firstName;
		this.lastName = lastName;
	}
	 
	 
	 
	public  String toString() {
		 //valorile campurilor nestatice (firstName, lastname) sunt cele 
		 //ale obiectului cu care va fi apelata toString()
		return "RomanianPerson [firstName=" + firstName + ", lastName=" + lastName + " , nationality=" + nationality + "]";
	}



	public static void main(String[] args) {
		RomanianPerson ion = new RomanianPerson("Ion", "popescu");
		RomanianPerson vasile =  new RomanianPerson("Vasile", "popescu");
		RomanianPerson.nationality = "romanian";
		vasile.nationality = "spaniol";
		System.out.println(ion.toString());
		System.out.println(vasile.toString());
		System.out.println(counter);
		System.out.println(ion.firstName);
		//System.out.println(firstName);
		
	}
	 
	
}