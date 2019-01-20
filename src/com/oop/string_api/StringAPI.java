package com.oop.string_api;

public class StringAPI {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String string1 = "Avioane de hartie, iiee, ooee.";
		char ch1 = string1.charAt(6); //primul caracter
		System.out.println(ch1);
		String string2 = "Avioane de hartie";
		String string3 = string1.concat(string2); //concatenare
		boolean bool1 = string1.contains(string2); //daca il contine pe string2
		boolean bool2 = string1.endsWith("ooee."); //daca se termina cu...
		String string4 = "aVioAne de HarTIe";
		//niciodata nu el comparam cu ==
		boolean bool3 = string2.equals(string4); //daca sunt egale
		boolean bool4 = string2.equalsIgnoreCase(string4); //daca sunt egale ignorand Case-ul
		int indexul = string1.indexOf('i'); //prima aparitie a lui h
		int lungime = string1.length(); //numarul de caractere
		String string5 = string1.replace('.', '!'); //inlocuieste
		String string51 = string1.replace("ie", "IE"); //inlocuieste
		boolean bool5 = string1.startsWith("Avioane"); //daca incepe cu
		String string6 = string1.substring(0, 6); // iiee
		String string7 = string4.toLowerCase();
		String string8 = string4.toUpperCase();
		System.out.println(string4);
		String string9 = " andra@avioanedehartie.ro     ";
		String string10 = string9.trim(); // eliminarea spatiilor albe de la
										  //inceput si sfarsit, pt emailuri, numere de telefon etc

		String[] words = string1.replaceAll("[,.]+", " ").split("\\s+");
		
		for (String string : words) {
			//System.out.println(string);
		}
	}

}
