package com.exceptions;

import java.io.*;

public class TryWithResources {
	public static void main(String[] args) {
		System.out.println("Try-with-resources example:");
		try (BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace\\GitProject\\java_school\\src\\com\\exceptions\\text.txt"))) {
			String firstLine = r.readLine();
			System.out.println(firstLine);
		} catch (IOException e) {
			System.out.println("Cannot read first line from text.txt: " + e.getMessage());
			//firstLine = ""; is not visible here
		}
	}
}
