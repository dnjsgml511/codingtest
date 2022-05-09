package com.test.test.backjoon.math2;

import java.util.Scanner;

public class Taret {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int x = 0;
			int y = 0;
			
			double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1- y2) * (y1- y2));
			System.out.println(distance);
		}

	}

}

/**

3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

*/