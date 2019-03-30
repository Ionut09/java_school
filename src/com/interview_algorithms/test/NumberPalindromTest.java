package com.interview_algorithms.test;

import org.junit.Test;

import com.interview_algorithms.NumberPalindrom;

import static org.junit.Assert.assertTrue;

public class NumberPalindromTest {

	@Test
	public void isNumberPalindrom() {
		NumberPalindrom np = new NumberPalindrom();
		assertTrue(np.isPalindromInt(123454321));
	}
}
