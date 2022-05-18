package com.test.test.backjoon.string;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = "";
		while (true) {
			line = sc.nextLine();
			if(line.equals(".")) break;
			String tmp = line.replaceAll("[a-zA-Z .]", "");
			System.out.println(right(tmp));
		}

		sc.close();
	}

	static String right(String bracket) {
		Stack<Character> stack = new Stack<>();

		char[] chars = bracket.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				stack.push('(');
			} else if (chars[i] == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				}
				stack.pop();
			}

			if (chars[i] == '[') {
				stack.push('[');
			} else if (chars[i] == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				}
				stack.pop();
			}
		}

		return stack.size() == 0 ? "yes" : "no";
	}
}
