package com.test.test.success.programers.level2;

import java.util.ArrayList;

public class ModifyMax {
	public static void main(String[] args) {

		String expression = "100-200*300-500+20"; // 60420
//		String expression = "50*6-3*2"; // 300
		long sol = sol(expression);
		System.out.println();
		System.out.println(sol);
	}

	static char[] prior = { '+', '-', '*' };
	static boolean[] check = new boolean[3];
	static ArrayList<Long> nums = new ArrayList<Long>();
	static ArrayList<Character> ops = new ArrayList<Character>();
	static long answer;

	private static long sol(String expression) {

		answer = 0;

		String num = "";

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
				num += expression.charAt(i);
			} else {
				nums.add(Long.parseLong(num));
				num = "";
				ops.add(expression.charAt(i));
			}
		}
		nums.add(Long.parseLong(num));

		dfs(0, new char[3]);

		return answer;
	}

	public static Long calc(Long num1, Long num2, char op) {
		long num = 0;
		switch (op) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		}

		return num;
	}

	public static void dfs(int count, char[] p) {
		if (count == 3) {
			ArrayList<Long> cNums = new ArrayList<Long>(nums);
			ArrayList<Character> cOps = new ArrayList<Character>(ops);

			for (int i = 0; i < p.length; i++) {
				for (int j = 0; j < cOps.size(); j++) {
					if (p[i] == cOps.get(j)) {
						Long res = calc(cNums.remove(j), cNums.remove(j), p[i]);
						cNums.add(j, res);
						cOps.remove(j);
						j--;
					}
				}
			}
			answer = Math.max(answer, Math.abs(cNums.get(0)));
		}

		for (int i = 0; i < 3; i++) {
			if (!check[i]) {
				check[i] = true;
				p[count] = prior[i];
				dfs(count + 1, p);
				check[i] = false;
			}
		}
	}
}
