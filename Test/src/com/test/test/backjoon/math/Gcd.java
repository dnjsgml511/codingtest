package com.test.test.backjoon.math;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int small = Math.min(num1, num2);

		int gcd = 0;
		for (int i = 1; i <= small; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		System.out.println(gcd);
		System.out.println(num1 * num2 / gcd);
	}

}
