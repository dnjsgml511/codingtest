package com.test.test.backjoon.math;

import java.util.Scanner;

public class ManyBridge {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < loop; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sb.append(dfs(b, a));
		}
		
		System.out.println(sb);
	}

	static int[][] dp = new int[30][30];

	static int dfs(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		}
		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}

		return dp[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
	}
}
