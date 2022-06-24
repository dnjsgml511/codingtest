package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/11057
public class TheNumberOfUphillClimbs {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n + 1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}

		System.out.println(Arrays.deepToString(dp));
		System.out.println("start");

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					System.out.println(i + " / " + j + " / " + k);
//					System.out.println(Arrays.deepToString(dp));
					dp[i][j] += dp[i - 1][k];
//					dp[i][j] %= 10007;
					System.out.println(Arrays.deepToString(dp));
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += dp[n][i];
		}
		
		System.out.println(sum % 10007);

		bw.flush();
		bw.close();
	}

}
