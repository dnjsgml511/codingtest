package com.test.test.backjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class RGBDistance {

	static int Red = 0;
	static int Green = 1;
	static int Blue = 2;

	static int[][] Cost;
	static int[][] DP;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Cost = new int[N][3];
		DP = new int[N][3];

		for (int i = 0; i < N; i++) {
			Cost[i][Red] = sc.nextInt();
			Cost[i][Green] = sc.nextInt();
			Cost[i][Blue] = sc.nextInt();
		}

		DP[0][Red] = Cost[0][Red];
		DP[0][Green] = Cost[0][Green];
		DP[0][Blue] = Cost[0][Blue];
		
		System.out
				.println(Math.min(Paint_cost(N - 1, Red), Math.min(Paint_cost(N - 1, Blue), Paint_cost(N - 1, Green))));
	}

	static int Paint_cost(int N, int color) {
		if (DP[N][color] == 0) {
			if (color == Red) {
				DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
			} else if (color == Green) {
				DP[N][Red] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
			} else if (color == Blue) {
				DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Red)) + Cost[N][Blue];
			}
		}
		return DP[N][color];
	}

}

/**
 * 
 * 3 26 40 83 49 60 57 13 89 99
 * 
 */