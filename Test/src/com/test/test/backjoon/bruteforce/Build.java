package com.test.test.backjoon.bruteforce;

import java.util.Scanner;

public class Build {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		int[][] human = new int[loop][2];
		for (int i = 0; i < loop; i++) {
			human[i][0] = sc.nextInt();
			human[i][1] = sc.nextInt();
		}

		sc.close();

		int[] win = new int[loop];
		for (int i = 0; i < human.length; i++) {
			int[] first = human[i];
			for (int j = 0; j < human.length; j++) {
				int[] second = human[j];

				if ((first[0] < second[0]) && (first[1] < second[1])) {
					win[i]--;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int data : win) {
			sb.append(data * (-1) + 1).append(" ");
		}

		System.out.println(sb.toString());
	}
}

/**
 * 
 * 5 177 75 133 16 183 75 126 156 49 24
 * 
 */