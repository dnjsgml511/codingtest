package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/14916
public class Change {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[] dp = new int[10001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = -1;
		dp[2] = 1;
		dp[3] = -1;
		dp[4] = -1;
		dp[5] = 1;

		for (int i = 6; i <= num; i++) {
			if (dp[i - 2] == -1 && dp[i - 5] == -1) {
				dp[i] = -1;
			} else if (dp[i - 2] == -1) {
				dp[i] = dp[i - 5] + 1;
			} else if (dp[i - 5] == -1) {
				dp[i] = dp[i - 2] + 1;
			} else {
				dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1;
			}
		}
		
		System.out.println(dp[num]);

		bw.flush();
		bw.close();
	}

}
