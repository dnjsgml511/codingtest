package com.test.test.backjoon.loop;

import java.util.Scanner;

public class APlusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		int[] arr = new int[loop];
		for (int i = 0; i < loop; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			arr[i] = first + second;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
