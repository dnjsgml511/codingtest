package com.test.test.backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int max = 0, site = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			max = Math.max(max, num);
			list.add(num);
		}

		System.out.println(max);
		System.out.println(list.indexOf(max) + 1);
	}
}
