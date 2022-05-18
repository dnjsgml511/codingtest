package com.test.test.backjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Tailing2N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[] dp = new int[n + 2];
		
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			System.out.println(Arrays.toString(dp));
			dp[i] = (dp[i -1] + dp[i - 2]) % 10007;
		}
		
		System.out.println(dp[n]);
	}



}
