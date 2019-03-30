package com.interview_algorithms;

public class NumberPalindrom {

	public boolean isPalindromInt(int input) {
		return new StringPalindrom().isPalindromString(new Integer(input).toString());
	}
}
