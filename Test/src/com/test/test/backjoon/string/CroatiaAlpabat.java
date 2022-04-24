package com.test.test.backjoon.string;

import java.util.Scanner;

public class CroatiaAlpabat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			while(text.indexOf(arr[i]) != -1) {
				text = text.replaceFirst(arr[i], " ");
				count++;
			}
			answer += count;
		}
		
		text = text.replaceAll(" ", "");
		System.out.println(answer + text.length());
	}
}
