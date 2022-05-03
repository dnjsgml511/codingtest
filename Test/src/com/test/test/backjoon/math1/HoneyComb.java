package com.test.test.backjoon.math1;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int range = 1, i = 1;
		while (true) {
			
			if(num <= range) {
				System.out.println(i);
				break;
			}
			
			range += i * 6;
			i++;
			
		}
	}
}
