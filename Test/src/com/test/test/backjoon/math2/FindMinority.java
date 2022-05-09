package com.test.test.backjoon.math2;

import java.util.Scanner;

public class FindMinority {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		int count = 0;
		for (int i = 0; i < loop; i++) {
			int num = sc.nextInt();
			if(check(num))
				count++;
		}
		
		System.out.println(count);
	}

	static boolean check(int num) {

		if (num == 1)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
