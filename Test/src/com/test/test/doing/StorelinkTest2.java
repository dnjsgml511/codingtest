package com.test.test.doing;

import java.util.Arrays;

public class StorelinkTest2 {

	public static void main(String[] args) {

//		for(int i = 1000; i < 10000; i++) {
//			int n = 50000000;
		int n = 45;

		int sol = sol(n);

		System.out.println();
		System.out.println(sol);
//			System.out.println(i + " = " + sol);
//		}

//		System.out.println(Arrays.toString(sol));
	}

	private static int sol(int N) {

		max = N;
		count = 0;
		dp(0);

		return count;
	}

	static int max, count;

	static void dp(int num) {
		
		if (num == max) {
			count++;
			
			return;
		}
		if (num > max) {
			return;
		}
		dp(num + 1);
		dp(num + 2);
	}

}
