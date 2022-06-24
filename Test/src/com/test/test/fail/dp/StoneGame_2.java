package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/9656
public class StoneGame_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 1;

		for (int i = 4; i <= num; i++) {
			dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
		}
		
		System.out.println(Arrays.toString(dp));

		bw.flush();
		bw.close();
	}

}
