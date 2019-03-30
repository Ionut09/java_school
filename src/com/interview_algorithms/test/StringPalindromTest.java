package com.interview_algorithms.test;

import org.junit.Test;

import com.interview_algorithms.StringPalindrom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringPalindromTest {

	@Test
	public void isPalindromStringTestTrueEven() {
		StringPalindrom strPal = new StringPalindrom();
		assertTrue(strPal.isPalindromString("abccba"));
	}

	@Test
	public void isPalindromStringTestTrueOdd() {
		StringPalindrom strPal = new StringPalindrom();
		assertTrue(strPal.isPalindromString("abcdcba"));
	}

	@Test
	public void isPalindromStringTestFalse() {
		StringPalindrom strPal = new StringPalindrom();
		assertFalse(strPal.isPalindromString("uqwiehudwiu"));
	}
}
