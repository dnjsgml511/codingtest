package com.test.test.backjoon.math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = -1, b = -1, c = -1;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0)
				break;

			List<Integer> list = new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);

			Integer max = Math.max(a, Math.max(b, c));
			list.remove(max);

			if (Math.pow(max, 2) == Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
