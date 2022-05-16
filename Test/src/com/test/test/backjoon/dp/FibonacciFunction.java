package com.test.test.backjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciFunction {

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		memo = new int[40];

		int num = fibonacci(39);
		
		System.out.println(num);

		memo[1] = 1;
		System.out.println(Arrays.toString(memo));

		sc.close();
	}

	static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if(memo[n] != 0) return memo[n];
		memo[n] = fibonacci(n -2) + fibonacci(n -1);
		return memo[n];
	}
}
