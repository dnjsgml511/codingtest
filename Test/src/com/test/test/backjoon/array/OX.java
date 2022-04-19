package com.test.test.backjoon.array;

import java.util.Scanner;

public class OX {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			String[] ox = sc.next().split("");
			int score = 1, sum = 0;
			for (String data : ox) {
				if (data.equals("O")) {
					sum += score;
					score += 1;
				} else {
					score = 1;
				}
			}
			System.out.println(sum);
		}

	}
}
