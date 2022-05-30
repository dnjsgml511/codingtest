package com.test.test.doing;

import java.io.IOException;

public class CompressionOfStrings {

	public static void main(String[] args) throws Exception {
		String s = "aabbaccc";
		int answer = 7;
//		String s = "ababcdcdababcdcd";
//		int answer = 9;
//		String s = "abcabcdede";
//		int answer = 8;
//		String s = "abcabcabcabcdededededede";
//		int answer = 14;
//		String s = "xababcdcdababcdcd";
//		int answer = 17;
//		String s = "werwerwsdgsdfsdfsdf";
//		int answer = 15;
		int sol = sol(s);

		System.out.println();
		System.out.println(sol);
		System.out.println(sol == answer);
	}

	static int sol(String s) throws IOException {

		min = s.length();

		for (int i = 1; i < s.length() / 2 + 1; i++)
			check(s, i);

		return min;
	}

	static int min;

	static void check(String s, int length) {

		System.out.println(s);
		int count = 0, depth = 0;
		int len = s.length();

		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= s.length() - length * 2; i++) {
			System.out.println(i);
			String first = s.substring(i, i + length);
			String second = s.substring(i + length, i + length * 2);

			System.out.println(first + " / " + second + " = " + first.equals(second));

			if (first.equals(second)) {
				i += first.length() * 2;
				len -= first.length();
			} else {

			}
		}

		System.out.println(len);
		System.out.println();
		System.out.println();

		min = Math.min(min, len);
	}
}
