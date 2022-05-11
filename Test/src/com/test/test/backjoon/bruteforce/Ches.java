package com.test.test.backjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Ches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] site = sc.nextLine().split(" ");

		String[] pan = new String[Integer.parseInt(site[1])];
		for (int i = 0; i < Integer.parseInt(site[1]); i++) {
			pan[i] = sc.nextLine();
		}

		sc.close();

		
	}

}
