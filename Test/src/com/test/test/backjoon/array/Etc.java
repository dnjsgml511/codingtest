package com.test.test.backjoon.array;

import java.util.HashSet;
import java.util.Scanner;

public class Etc {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		HashSet<Integer> set = new HashSet<Integer>();
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt() % 42;
			boolean check = set.add(num);
			if(check) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
