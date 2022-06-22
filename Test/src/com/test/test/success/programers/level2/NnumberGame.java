package com.test.test.success.programers.level2;

public class NnumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = { 2, 16, 16 };
		int[] t = { 4, 16, 16 };
		int[] m = { 2, 2, 2 };
		int[] p = { 1, 1, 2 };
		String[] result = { "0111", "02468ACE11111111", "13579BDF01234567" };

		for (int i = 0; i < n.length; i++) {
			String sol = solution(n[i], t[i], m[i], p[i]);

			System.out.println(sol);
			
			if (!result[i].equals(sol)) {
				System.out.println("Fail");
				return;
			} else {
				System.out.println("Go");
			}
		}
		System.out.println("Success");
	}

	static String solution(int n, int t, int m, int p) {
		StringBuilder sb = new StringBuilder();
		sb.append("0");
		int size = m * (t - 1) + p - 1;

		int index = 1;
		while (sb.length() <= size) {
			StringBuilder num = Nnumber(index++, n);
			sb.append(num);
		}

		StringBuilder answer = new StringBuilder();
		int site = p - 1;
		while (answer.length() != t) {
			answer.append(sb.charAt(site));
			site += m;
		}

		return answer.toString();
	}

	static StringBuilder Nnumber(int number, int N) {
		StringBuilder sb = new StringBuilder();
		int current = number;

		while (current > 0) {
			if (current % N < 10) {
				sb.append(current % N);
			} else {
				sb.append((char) (current % N - 10 + 'A'));
			}
			current /= N;
		}

		return sb.reverse();
	}

}
