package com.test.test.backjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortSite2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		
		int[][] site = new int[loop][2];
		for (int i = 0; i < loop; i++) {
			site[i][0] = sc.nextInt();
			site[i][1] = sc.nextInt();
		}
		
		sc.close();

		Arrays.sort(site, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		for(int i = 0; i < site.length; i++) {
			System.out.println(site[i][0] + " " + site[i][1]);
		}
		
	}

}
