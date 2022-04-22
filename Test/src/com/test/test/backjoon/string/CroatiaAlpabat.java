package com.test.test.backjoon.string;

import java.util.Scanner;

public class CroatiaAlpabat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int beforeLength = text.replaceAll(" ", "").length();
			text = text.replaceAll(arr[i], " ");
			int afterLength = text.replaceAll(" ", "").length();

			answer += (beforeLength - afterLength) / 2;
		}

		text = text.replaceAll(" ", "");
		System.out.println(answer + text.length());
	}

}
