package com.test.test.backjoon.dp;

import java.util.Scanner;

public class Resignation {

	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int days = sc.nextInt();

		int[] workday = new int[days];
		int[] pays = new int[days];
		int[] dp = new int[days];

		for (int i = 0; i < days; i++) {
			workday[i] = sc.nextInt();
			pays[i] = sc.nextInt();
		}

	}

	static int dp(int num, int day) {
		if (dp[num] == 0) {
			
		}
		return dp[num];
	}

}
