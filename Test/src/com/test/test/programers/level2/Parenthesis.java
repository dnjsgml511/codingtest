package com.test.test.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String p = "(()())()"; // "(()())()"
//		String p = ")("; // "()"
		String p = "()))((()"; // "()(())()"

		String sol = sol(p);

		System.out.println();
		System.out.println(sol);
	}

	private static String sol(String p) {

		String success = "";

		while (p.length() == 0) {
			int i = 0;
			for (; i < p.length(); i++) {
				System.out.println(p);
				String cut = p.substring(0, i);
				boolean check = rightParenthesis(cut);
				if (check) {
					success += cut;
					p = p.substring(i);
					i = 0;
				}
			}
			if (i == p.length()) {
				StringBuilder sb = new StringBuilder();
				String[] split = p.split("");
				for (int k = split.length; k >= 0 ; --k) {
					
				}
			}
		}

//		String[] arr = p.split("");
//		boolean[] visited = new boolean[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			comb(arr, visited, 0, i);
//		}
//
		return "";
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
