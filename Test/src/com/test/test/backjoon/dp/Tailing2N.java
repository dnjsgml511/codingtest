package com.test.test.backjoon.dp;

import java.util.Scanner;

public class Tailing2N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();

		sc.close();

		int[] dp = new int[1001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= len; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		System.out.println(dp[len]);
	}

}
