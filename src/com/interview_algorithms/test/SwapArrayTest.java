package com.interview_algorithms.test;

import com.interview_algorithms.SwapArray;

import static org.junit.Assert.assertArrayEquals;

public class SwapArrayTest {

	public void swapTest() {
		SwapArray swap = new SwapArray();
		int[] input = { 3, 6, 0, 1, 0, 0, 3, 99 };
		int[] output = { 0, 0, 0, 3, 6, 1, 3, 99 };
		swap.swap(input);
		assertArrayEquals(output, input);
	}
}
