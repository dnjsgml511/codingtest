package com.test.test.backjoon.string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sangsoo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> first = Arrays.asList(sc.next().split(""));
		List<String> second = Arrays.asList(sc.next().split(""));

		StringBuilder firstword = new StringBuilder();
		StringBuilder secondword = new StringBuilder();

		for (int i = first.size() - 1; i >= 0; --i) {
			firstword.append(first.get(i));
			secondword.append(second.get(i));
		}

		int firstnum = Integer.parseInt(firstword.toString());
		int secondnum = Integer.parseInt(secondword.toString());
		
		System.out.println(Math.max(firstnum, secondnum));
	}

}
