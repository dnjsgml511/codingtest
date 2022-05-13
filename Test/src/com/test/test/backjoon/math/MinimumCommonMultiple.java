package com.test.test.backjoon.math;

import java.util.Scanner;

public class MinimumCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int min = Math.min(num1, num2);

			int gcd = 0;
			for (int j = 1; j <= min; j++) {
				if (num1 % j == 0 && num2 % j == 0) {
					gcd = j;
				}
			}
			
			System.out.println(num1 * num2 / gcd);
		}
		sc.close();
	}

}
