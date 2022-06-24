package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11052
public class BuyingACard {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count + 1];
		int[] dp = new int[count + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 1;
		while (st.hasMoreTokens()) {
			arr[index++] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(dp));
		System.out.println(" -- start --");

		for (int i = 0; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(" I : " + i + " / J : " + j);
				System.out.println(Arrays.toString(dp));
				dp[i] = Math.max(dp[i], dp[i -j] + arr[j]);
				System.out.println(Arrays.toString(dp));
				System.out.println("----------------------");
			}
		}
		
		System.out.println(dp[count]);


		bw.flush();
		bw.close();
	}

}

//4
//1 5 6 7