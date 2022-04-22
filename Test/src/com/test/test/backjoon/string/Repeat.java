package com.test.test.backjoon.string;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			int repeat = sc.nextInt();
			String[] str = sc.next().split("");
			StringBuilder sb = new StringBuilder();
			for (String data : str) {
				for (int j = 0; j < repeat; j++) {
					sb.append(data);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
