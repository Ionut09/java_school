package com.interview_algorithms;

/**
 * 
 * @author ionut.spalatelu
 *
 *         int[] input = {3,6,0,1,0,0,3,99}; int[] output = {0,0,0,3,6,1,3,99};
 *
 */

public class SwapArray {

	public void swap(int[] input) {
		boolean moreSwaps = true;
		while (moreSwaps) {
			moreSwaps = false;
			for (int i = 0; i < input.length - 1; i++) {
				if (input[i] != 0 && input[i + 1] == 0) {
					input[i + 1] = input[i];
					input[i] = 0;
					moreSwaps = true;
				}
			}
		}
	}

}
