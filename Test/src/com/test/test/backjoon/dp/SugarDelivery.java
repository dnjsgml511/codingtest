package com.test.test.backjoon.dp;

import java.util.Scanner;

public class SugarDelivery {

	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		sc.close();

		min5bag(num / 5);
	}

	static void min5bag(int fivebag) {
		int etc = num - (fivebag * 5);

		if (fivebag == 0) {
			if (num % 3 != 0) {
				System.out.println(-1);
			} else {
				System.out.println(etc / 3);
			}
			return;
		}

		if (etc % 3 == 0) {
			System.out.println(fivebag + (etc / 3));
			return;
		}

		min5bag(--fivebag);
	}
}
