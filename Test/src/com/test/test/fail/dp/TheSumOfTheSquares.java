package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1699
public class TheSumOfTheSquares {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num + 1];
		int[] dp = new int[1001];

		for (int i = 1; i <= num; i++) {
			dp[i] = i;
		}

		for (int i = 0; i <= num; i++) {
			for (int j = 1; j * j <= i; j++) {
				System.out.println(i + " / " + j);
				System.out.println(Arrays.toString(dp));
				if (dp[i] > dp[i - (j * j) + 1]) {
					dp[i] = dp[i - (j * j)] + 1;
				}
				System.out.println(Arrays.toString(dp));
			}
		}

		bw.flush();
		bw.close();
	}

}
