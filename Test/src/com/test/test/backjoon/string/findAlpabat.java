package com.test.test.backjoon.string;

import java.util.Scanner;

public class findAlpabat {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -2;
		}

		for (int i = 0; i < arr.length; i++) {
			char site = (char) (i + 97);
			if (arr[i] == -2)
				arr[i] = str.indexOf(site);
		}

		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
