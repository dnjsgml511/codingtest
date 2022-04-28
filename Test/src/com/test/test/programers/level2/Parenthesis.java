package com.test.test.programers.level2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String p = "(()())()";
		String answer = "(()())()";
//		String p = ")("; 
//		String answer = "()";
//		String p = "()))((()"; 
//		String answer = "()(())()";

		String sol = sol(p);

		System.out.println();
		System.out.println(sol);
		System.out.println(sol.equals(answer));
	}

	private static String sol(String p) {

		StringBuilder sb = new StringBuilder();

		String u = "", v = p;
		while (v.length() != 0) {
			String[] split = splitUV(v);
			u = split[0];
			v = split[1];

			if (rightParenthesis(u)) {
				sb.append(u);
			} else {
				String change = innerChange(u);
				sb.append(change);
			}
		}

		return sb.toString();
	}

	private static String innerChange(String u) {

		int i = 1;
		String in = "", first = "", second = "";
		while (!rightParenthesis(u)) {
			int len = u.length() / 2;
			first = u.substring(0, len - i);
			second = u.substring(len + i);

			in = "(" + in + ")";
			u = first + second;
		}

		return first + in + second;
	}

	private static String[] splitUV(String v) {
		Stack<String> stack = new Stack<String>();
		String[] split = v.split("");
		String push = split[0].equals("(") ? "(" : ")";
		int count = 0;
		for (String data : split) {
			count++;
			if (data.equals(push)) {
				stack.push(push);
			} else {
				stack.pop();
			}
			if (stack.isEmpty()) {
				break;
			}
		}
		String u = v.substring(0, count);
		v = v.substring(count);

		String[] ret = { u, v };
		return ret;
	}

	private static boolean rightParenthesis(String p) {
		Stack<String> stack = new Stack<String>();
		String[] split = p.split("");

		for (String data : split) {
			if (data.equals("(")) {
				stack.push(data);
			} else if (data.equals(")")) {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

}
