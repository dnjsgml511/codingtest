package com.test.test.backjoon.function;

import java.util.Scanner;

public class Onenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int count = num;
		for (int i = 100; i <= num; i++) {
			String[] arr = Integer.toString(i).split("");
			int first = Integer.parseInt(arr[0]);
			int second = Integer.parseInt(arr[1]);
			int last = Integer.parseInt(arr[2]);
			if (second - first != last - second) {
				count--;
			}
		}

		System.out.println(count);
	}

}
