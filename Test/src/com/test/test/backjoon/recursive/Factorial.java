package com.test.test.backjoon.recursive;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		sum = num;
		fact(--num);

		System.out.println(sum);
	}

	static long sum;

	static void fact(int num) {
		System.out.println(sum);
		sum *= num;
		num--;
		if (num == 0)
			return;

		fact(num);
	}

}
