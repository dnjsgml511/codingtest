package com.test.test.backjoon.string;

import java.util.Scanner;

public class FlipOver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		int zero = 0, one = 0;
		int flag = -1;
		for (int i = 0; i < n.length(); i++) {
			int ch = n.charAt(i);
			if (flag != ch) {
				if (ch == '0') {
					zero++;
				} else {
					one++;
				}
				flag = ch;
			}
		}
		
		System.out.println(Math.min(zero, one));
		
	}

}
