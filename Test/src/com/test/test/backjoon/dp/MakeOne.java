package com.test.test.backjoon.dp;

import java.util.Scanner;

public class MakeOne {

	static Integer[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		dp = new Integer[num + 1];
		dp[0] = dp[1] = 0;

		System.out.println(calc(num));
	}

	static int calc(int num) {
		if (dp[num] == null) {
			if (num % 6 == 0) {
				dp[num] = Math.min(calc(num - 1), Math.min(calc(num / 3), calc(num / 2))) + 1;
			} else if (num % 3 == 0) {
				dp[num] = Math.min(calc(num / 3), calc(num - 1)) + 1;
			} else if (num % 2 == 0) {
				dp[num] = Math.min(calc(num / 2), calc(num - 1)) + 1;
			} else {
				dp[num] = calc(num - 1) + 1;
			}
		}
		return dp[num];
	}

}
