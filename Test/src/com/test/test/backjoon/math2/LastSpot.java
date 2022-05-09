package com.test.test.backjoon.math2;

import java.util.Scanner;

public class LastSpot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int spot11 = sc.nextInt();
		int spot12 = sc.nextInt();

		int spot21 = sc.nextInt();
		int spot22 = sc.nextInt();

		int spot31 = sc.nextInt();
		int spot32 = sc.nextInt();

		int spot41 = 0;
		int spot42 = 0;
		
		if (spot11 == spot21) {
			spot41 = spot31;
		} else if (spot21 == spot31) {
			spot41 = spot11;
		} else {
			spot41 = spot21;
		}
		
		if (spot12 == spot22) {
			spot42 = spot32;
		} else if (spot22 == spot32) {
			spot42 = spot12;
		} else {
			spot42 = spot22;
		}
		
		System.out.println(spot41 + " " + spot42);
	}

}

/**
5 5
5 7
7 5
*/