package com.test.test.backjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		String[][] arr = new String[loop][2];
		for (int i = 0; i < loop; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});

		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
	}
}
