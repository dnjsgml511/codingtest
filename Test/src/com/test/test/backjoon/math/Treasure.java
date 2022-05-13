package com.test.test.backjoon.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		sc.close();

		int[] ranks = new int[n];
		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (a[i] > a[j])
					rank++;
			}
			ranks[i] = rank;
		}

		List<Integer> ranklist = new ArrayList<>();
		List<Integer> alist = new ArrayList<>();
		List<Integer> blist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			ranklist.add(ranks[i]);
			alist.add(a[i]);
			blist.add(b[i]);
		}
		
		Collections.sort(blist, Collections.reverseOrder());

		int sum = 0;
		while (!ranklist.isEmpty()) {
			int min = Integer.MAX_VALUE, index = -1;
			for (int i = 0; i < ranklist.size(); i++) {
				if (min > ranklist.get(i)) {
					min = ranklist.get(i);
					index = i;
				}
			}
			sum += alist.get(index) * blist.get(0);
			
			alist.remove(index);
			blist.remove(0);
			ranklist.remove(index);
		}
		
		System.out.println(sum);
	}

}
