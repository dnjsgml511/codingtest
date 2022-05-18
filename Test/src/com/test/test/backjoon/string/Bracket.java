package com.test.test.backjoon.string;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			System.out.println(check(sc.next()));
		}
		
		sc.close();
	}
	
	static String check(String bracket) {
		Stack<Integer> stack = new Stack<>();

		char[] chars = bracket.toCharArray();
		for (char c : chars) {
			if(c == '(') {
				stack.push(1);
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		String ret = stack.size() == 0 ? "YES" : "NO";
		return ret;
	}

}
