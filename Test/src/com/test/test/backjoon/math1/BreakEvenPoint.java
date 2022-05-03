package com.test.test.backjoon.math1;

import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int defaultValue = sc.nextInt();
		int humanValue = sc.nextInt();
		int salesValue = sc.nextInt();

		int onepriceValue = salesValue - humanValue;
		int value = defaultValue;
		
		if(onepriceValue <= 0) {
			System.out.println(-1);
			return;
		}
		
		int count = 0;
		while(value >= 0) {
			value -= onepriceValue;
			count++;
		}
		
		System.out.println(count);
	}

}
