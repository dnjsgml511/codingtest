package com.test.test.backjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		sc.close();

		String[] arr = new String[word.length()];
		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.substring(i, word.length());
		}
		
		Object[] sort = Arrays.stream(arr).sorted().toArray();
		
		for(Object data : sort) {
			System.out.println(data);
		}
		
	}
}
