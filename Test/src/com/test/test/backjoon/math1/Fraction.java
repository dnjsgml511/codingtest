package com.test.test.backjoon.math1;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int son = 1, parent = 1, all = 2;
		boolean flag = false;
		for (int i = 1; i <= num; i++) {
			if (flag) {
				son--;
				parent++;
			} else {
				son++;
				parent--;
			}
			
			if(son == 0) {
				son = 1;
				parent = all - 1;
				all++;
				flag = false;
			}
			if(parent == 0) {
				son = all - 1;
				parent = 1;
				all++;
				flag = true;
			}
		}
		System.out.println(son + "/" + parent);
	}

}
