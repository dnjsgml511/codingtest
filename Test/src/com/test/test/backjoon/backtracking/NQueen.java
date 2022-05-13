package com.test.test.backjoon.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueen {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		arr = new int[n];
		nQueen(0);
		System.out.println(count);

	}

	static int[] arr;
	static int n;
	static int count = 0;

	static void nQueen(int depth) {
		if (depth == n) {
			count++;
			return;
		}
		for (int i = 0; i < n; i++) {
			arr[depth] = i;
			if (possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	static boolean possibility(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[col] == arr[i]) {
				return false;
			} else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}
