package com.test.test.backjoon.backtracking;

import java.util.Scanner;

public class NandM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		permutation(sc.nextInt(), sc.nextInt());
		
		sc.close();
	}

	static void permutation(int n, int round) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		boolean[] isVisit = new boolean[n];
		int[] output = new int[n];

		permutation(arr, output, isVisit, 0, n, round);
	}

	static void permutation(int[] array, int[] output, boolean[] isVisit, int depth, int length, int count) {
		if (count == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < output.length; i++) {
				if (output[i] != 0) {
					sb.append(output[i]).append(" ");
				}
			}
			System.out.println(sb.toString());
			return;
		}

		for (int i = 0; i < length; i++) {
			if (!isVisit[i]) {
				isVisit[i] = true;
				output[depth] = array[i];
				permutation(array, output, isVisit, depth + 1, length, count - 1);
				isVisit[i] = false;
			}
		}

	}
}
