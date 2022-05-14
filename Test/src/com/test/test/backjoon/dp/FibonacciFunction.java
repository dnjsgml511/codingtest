package com.test.test.backjoon.dp;

import java.util.Scanner;

public class FibonacciFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fibonacci(sc.nextInt());

		System.out.println(zero + " " + one);
	}

	static int zero = 0, one = 0;

	static int fibonacci(int num) {

		if (num == 0) {
			zero++;
			return num;
		}

		if (num == 1) {
			one++;
			return num;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
