package com.test.test.backjoon.bruteforce;

import java.util.Scanner;

public class End666 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt() + 1;

		sc.close();

		String six = "666";

		String convert = convert(num);
		System.out.println(convert);

	}

	static String convert(int num) {
		StringBuilder sb = new StringBuilder();
		int current = num;

		while (current > 0) {
			sb.append(current % 17);
			current /= 17;
		}


		return sb.reverse().toString();
	}

}
