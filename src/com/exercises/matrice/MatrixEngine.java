package com.exercises.matrice;

import static java.lang.Integer.MIN_VALUE;

import java.util.Random;

public class MatrixEngine {
	private int[][] matrice = new int[3][3];

	public int[][] getMatrice() {
		return matrice;
	}

	public void setMatrice(int[][] matrice) {
		this.matrice = matrice;
	}

	public static void main(String[] args) {
		MatrixEngine m = new MatrixEngine();
		m.initMatrice();
		m.showMatrice();
	}

	public void initMatrice() {
//		for(int[] array : matrice) {
//			for(int elem : array) {
//				
//				elem = new Random().nextInt(100);
//			}
//		} nu merge pt ca la primitive transferul se face prin valoare

//		for (int i = 0; i <= 2; i++) {
//			for (int j = 0; j <= 2; j++) {
//				matrice[i][j] = i + j;
//			}
//		}

		int i = 0;
		for (int[] array : matrice) {
			for (int j = 0; j < array.length; j++) {
				array[j] = j + i;
			}
			++i;
		}
	}

	public void showMatrice() {
		printHeader();
		for (int i = 0; i < 3; i++) {
			printBar();
			for (int j = 0; j < 3; j++) {
				System.out.print("\t" + matrice[i][j] + "\t");
			}
			if (i != matrice.length - 1) {
				System.out.println("|\n");
			} else {
				System.out.println("|");
			}
		}
		printHeader();
	}

	private void printBar() {
		System.out.print("|");
	}

	private void printHeader() {
		System.out.println(" __ \t\t\t\t\t      __\n");
	}
	
	public int maxDiagPrincipala() {
		int max = MIN_VALUE;
		for (int i = 0; i <= 2; i++) {
			if(matrice[i][i] > max) {
				max = matrice[i][i];
			}
		}
		return max;

	}
	
}
