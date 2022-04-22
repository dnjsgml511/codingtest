package com.test.test.backjoon.string;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		if (str.equals(""))
			System.out.println(0);
		else
			System.out.println(str.split(" ").length);
	}

}
