package com.test.test.backjoon.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BertrandChebyshevTheorem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			int start = sc.nextInt();
			int end = start * 2;

			if (start == 0)
				break;

			System.out.println(findPrimes(end).stream().filter(i -> i > start).count());
		}
	}

	static List<Integer> findPrimes(int num) {

		boolean[] primes = new boolean[num + 1];

		primes[0] = primes[1] = true;

		for (int i = 2; i * i <= num; i++) {
			if (!primes[i]) {
				for (int j = i * i; j <= num; j += i)
					primes[j] = true;
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			if (!primes[i])
				list.add(i);
		}

		return list;
	}

}
