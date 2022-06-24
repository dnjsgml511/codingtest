package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2193
public class LeeChinSoo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] dp = new int[num + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= num; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(Arrays.toString(dp));

		bw.flush();
		bw.close();
	}

}
