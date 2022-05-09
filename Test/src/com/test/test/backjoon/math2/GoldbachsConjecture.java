package com.test.test.backjoon.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoldbachsConjecture {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		for (int k = 0; k < loop; k++) {
			int num = sc.nextInt();
			List<Integer> list = findPrimes(num);
			int[] twonum = findTwoNum(list, num);
			System.out.println(twonum[0] + " " + twonum[1]);
		}
	}

	static int[] findTwoNum(List<Integer> list, int num) {

		List<List<Integer>> tmp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == num) {
					List<Integer> inlist = new ArrayList<>();
					inlist.add(list.get(i));
					inlist.add(list.get(j));
					tmp.add(inlist);
				}
			}
		}

		int min = num + 1, x = 0, y = 0;
		for (List<Integer> data : tmp) {
			int minuse = Math.abs(data.get(0) - data.get(1));
			if (min > minuse) {
				min = minuse;
				x = data.get(0);
				y = data.get(1);
			}
		}

		int[] ret = { x, y };

		return ret;
	}

	static List<Integer> findPrimes(int num) {

		boolean[] primes = new boolean[num + 1];
		primes[0] = primes[1] = true;

		for (int i = 0; i * i <= num; i++) {
			if (!primes[i]) {
				for (int j = i * i; j <= num; j += i)
					primes[j] = true;
			}
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 2; i < primes.length; i++) {
			if (!primes[i])
				list.add(i);
		}

		return list;
	}
}
