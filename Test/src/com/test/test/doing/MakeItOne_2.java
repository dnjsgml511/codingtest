package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/12852
public class MakeItOne_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] dp = new int[num + 2];
		int[] path = new int[num + 1];

		

		System.out.println(Arrays.toString(dp));
		System.out.println(dp[num]);

		bw.flush();
		bw.close();
	}

}
