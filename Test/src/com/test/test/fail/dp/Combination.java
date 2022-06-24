package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2407
public class Combination {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] dp = new int[1001][1001];
		int[] arr = new int[M];

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(Arrays.deepToString(dp));
				if (j == 0 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
				System.out.println(Arrays.deepToString(dp));
			}
		}
		
		System.out.println(dp[N][M]);

		bw.flush();
		bw.close();
	}

}
// 100 6
