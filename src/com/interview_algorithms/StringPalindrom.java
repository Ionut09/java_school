package com.interview_algorithms;

public class StringPalindrom {

	public boolean isPalindromString(String input) {
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
