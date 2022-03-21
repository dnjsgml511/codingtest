package com.test.test;

public class ForecatingTable {
	public static void main(String[] args) {
		int n = 8, a = 4, b = 7; // 3
		int sol = sol(n, a, b);

		System.out.println();
//		System.out.println(sol);
	}

	private static int sol(int n, int a, int b) {

		int num = 1;
		int max = 0;
		while(num != n) {
			num *= 2;
			max++;
		}

		int big = Math.max(a, b);
		int small = Math.min(a, b);
		
		while(n / 2 != 1) {
			n /= 2;
			
			if(small <= n && big > n) {
				System.out.println("go");
			}else {
				break;
			}
		}
		
		System.out.println(n);
		

		return 0;
	}
}
