package com.test.test.backjoon.dp;

import java.util.Scanner;

public class Add123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			count = 0;
			make(sc.nextInt());
			System.out.println(count);
		}
	}

	static int count;

	static void make(int num) {
		if(num == 0) {
			count++;
		}
		if (num < 0) {
			return;
		}

		make(num - 1);
		make(num - 2);
		make(num - 3);
	}
}

// 3 4 7 10
// 7 44 274