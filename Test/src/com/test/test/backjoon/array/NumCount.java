package com.test.test.backjoon.array;

import java.util.HashMap;
import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		String[] str = Integer.toString(num).split("");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String data : str) {
			int value = map.getOrDefault(data, 0);
			map.put(data, ++value);
		}

		for (int i = 0; i < 10; i++) {
			int value = map.getOrDefault(Integer.toString(i), 0);
			System.out.println(value);
		}
	}
}
