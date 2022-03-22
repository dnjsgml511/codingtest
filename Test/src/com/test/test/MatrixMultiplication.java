package com.test.test;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } }, arr2 = { { 3, 3 }, { 3, 3 } }; // {{15, 15}, {15, 15}, {15,
																						// 15}}
//		int[][] arr1 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } }, arr2 = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } }; // {{22, 22, 11}, {15, 15}, {15, 15}}

		int[][] sol = sol(arr1, arr2);

		for (int[] data : sol) {
			System.out.println(Arrays.toString(data));
		}
	}

	private static int[][] sol(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[3][2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					arr[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		return arr;
	}

}
