package com.test.test.backjoon.math2;

import java.util.Scanner;

public class MinorityRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int[] monority = monority(start, end);
		
		if(monority[0] == -1) {
			System.out.println(-1);
		}else {
			System.out.println(monority[0]);
			System.out.println(monority[1]);
		}
	}

	static int[] monority(int start, int end) {

		boolean[] prime = new boolean[end + 1];

		prime[0] = prime[1] = true;

		for (int i = 2; i * i <= end; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= end; j += i) {
					prime[j] = true;
				}
			}
		}

		int sum = 0, first = -1;
		for (int i = start; i <= end; i++) {
			if(!prime[i]) {
				sum+= i;
				if(first == -1) {
					first = i;
				}
			}
		}

		if(first == -1) {
			sum = -1;
		}
		
		int[] answer = {sum, first};
		
		return answer;
	}

}
