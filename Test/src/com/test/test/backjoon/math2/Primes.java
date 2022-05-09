package com.test.test.backjoon.math2;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();

		boolean[] primes = findPrime(end);
		
		for(int i = start; i <= end; i++) {
			if(!primes[i]) System.out.println(i);
		}

	}

	static boolean[] findPrime(int num) {
		boolean[] primes = new boolean[num + 1];

		primes[0] = primes[1] = true;

		for (int i = 2; i * i <= num; i++) {
			if (!primes[i]) {
				for (int j = i * i; j <= num; j += i)
					primes[j] = true;
			}
		}

		return primes;
	}
}
