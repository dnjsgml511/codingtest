package com.test.test.backjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class StageUp {

	static boolean[] step;
	static int[] dp, arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		arr = new int[loop];
		for (int i = 0; i < loop; i++) {
			arr[i] = sc.nextInt();
		}

		dp = new int[loop];
		step = new boolean[loop];
		
		System.out.println(dp(0));
	}

	static int dp(int num) {

		System.out.println(num + " / " + Arrays.toString(dp));
		
		if(arr[num] == 0) {
			arr[num] = Math.min(dp(num + 1), dp(num + 2)) + arr[num];
		}

		return arr[num];
	}

}

/**
 * 6 10 20 15 25 10 20
 */