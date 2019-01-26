package com.oop.var_args;

public class VarArgs {
	static int si = 10;

	public String toString() {
		return "TestClass.si = " + this.si;
	}

	public static void main(String[] args) {
		System.out.println(varArgsMethod());
		System.out.println(varArgsMethod("George", "Andrei"));
		System.out.println(varArgsMethod("George", "Andrei", "Ciprian"));
		System.out.println(varArgsMethod("George", "Andrei", "Ana", "Eliza", "Marius"));
		int x = 3;
		switch (x) {
		case 1:
		case 2:
		case 0:
		default:
		case 4:
		}
	}

	private static int varArgsMethod(String... strArray) {
		int totalLength = 0;
		// il vede ca un array in methoda
		for (String str : strArray) {
			totalLength += str.length();
		}
		return totalLength;
	}

	private static int varArgsMethod(String str) {
		return 1;
	}
}
