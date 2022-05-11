package com.test.test.backjoon.bruteforce;

import java.util.Scanner;

public class DecompositionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		int start = 0;
		
		for (; start < num; start++) {
			String[] split = Integer.toString(start).split("");
			int sum = start;
			for (String data : split) {
				sum += Integer.parseInt(data);
			}
			if (sum == num) {
				break;
			}
		}

		if (start == num) {
			System.out.println(0);
		} else {
			System.out.println(start);
		}
	}

}
