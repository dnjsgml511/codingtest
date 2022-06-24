package com.test.test.fail.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2579
public class ClimbingTheStairs {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] stair = new int[301];
		int[] score = new int[301];

		for (int i = 1; i <= N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}

		score[1] = stair[1];
		score[2] = stair[1] + stair[2];
		score[3] = Math.max(stair[1], stair[2]) + stair[3];

		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(stair));
		System.out.println(" -- start --");
		for (int n = 4; n <= N; n++) {
			System.out.println(n);
			System.out.println(Arrays.toString(score));
			score[n] = Math.max(score[n - 3] + stair[n - 1], score[n - 2]) + stair[n];
			System.out.println(Arrays.toString(score));
			System.out.println();
		}

		System.out.println(score[N]);
		
		bw.flush();
		bw.close();
	}

}

//6
//10
//20
//15
//25
//10
//20
