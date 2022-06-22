package com.test.test.success.programers.level2;

public class ForecatingTable {
	public static void main(String[] args) {
		int n = 8, a = 4, b = 7; // 3
//		int n = 8, a = 7, b = 8; // 3
//		int n = 16, a = 9, b = 12; // 2
//		int n = 8, a = 4, b = 5; // 3
		int sol = sol(n, a, b);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(int n, int a, int b) {

		int big = Math.max(a, b);
		int small = Math.min(a, b);

		int count = 1;
		while (true) {

			if (small % 2 != 0 && big == small + 1) {
				break;
			}
			big = (big + 1) / 2;
			small = (small + 1) / 2;

			count++;
		}

		return count;
	}
}
