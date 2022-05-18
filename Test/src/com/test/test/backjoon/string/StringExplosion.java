package com.test.test.backjoon.string;

import java.util.Scanner;
import java.util.Stack;

public class StringExplosion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String reg = sc.next();

		sc.close();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));

			if (stack.size() >= reg.length()) {
				boolean flag = true;
				for (int j = 0; j < reg.length(); j++) {
					if (stack.get(stack.size() - reg.length() + j) != reg.charAt(j)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					for (int j = 0; j < reg.length(); j++) {
						stack.pop();
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char c : stack) {
			sb.append(c);
		}

		System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
	}
}
