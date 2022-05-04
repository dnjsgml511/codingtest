package com.test.test.backjoon.math1;

import java.util.Scanner;
import java.util.TreeSet;

public class ACMHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		
		for (int i = 0; i < loop; i++) {
			int height = sc.nextInt();
			int width = sc.nextInt();
			int number = sc.nextInt();

			int floor = number % height;
			int deep = number / height + 1;
			
			System.out.println(floor);
			System.out.println(deep);

			System.out.println(floor * 100 + deep);
		}
	}

}
