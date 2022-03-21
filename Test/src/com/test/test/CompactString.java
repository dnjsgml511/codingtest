package com.test.test;

public class CompactString {

	public static void main(String[] args) {

		String s = "aabbaccc";// 7
//		String s = "ababcdcdababcdcd";// 9
//		String s = "abcabcdede";// 8
//		String s = "abcabcabcabcdededededede";// 14
//		String s = "xababcdcdababcdcd";// 17

		int sol = sol(s);
		System.out.println();
		System.out.println(sol);
	}

	private static int sol(String s) {

		int answer = s.length();

		for (int i = 1; i < s.length() / 2; i++) {
			int zipLevel = 1;
			String zipStr = s.substring(0, i);
			StringBuilder result = new StringBuilder();

			for (int j = 0; j <= s.length(); j += i) {
				String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
				
				if(zipStr.equals(next)) zipLevel++;
				else {
					result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
					zipStr = next;
					zipLevel = 1;
				}
			}
			
			result.append(zipStr);
			answer = Math.min(answer, result.length());
		}

		return answer;
	}
}
