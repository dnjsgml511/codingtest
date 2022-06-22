package com.test.test.success.programers.level2;

import java.io.IOException;

public class CompressionOfStrings {

	public static void main(String[] args) throws Exception {
		
		String[] s = {
				"aabbaccc",
				"ababcdcdababcdcd",
				"abcabcdede",
				"abcabcabcabcdededededede",
				"xababcdcdababcdcd",
				"a"
		};
		
		int[] answer = {
				7, 9, 8, 14, 17, 1
		};
		
		for(int i = 0; i < s.length; i++) {
			int sol = sol(s[i]);
			System.out.println();
			System.out.println(sol);
			System.out.println(sol == answer[i]);
			if(sol != answer[i]) {
				return;
			}
			System.out.println();
		}
		
		System.out.println("Success");
	
	}

	static int sol(String s) throws IOException {

		int min = Integer.MAX_VALUE;

		if(s.length() == 1) {
			min = 1;
		}
		
		for (int i = 1; i < s.length() / 2 + 1; i++) {
			String tmp = s;
			int count = 1;
			StringBuilder sb = new StringBuilder();

			while (true) {

				String search = tmp.substring(0, i);
				tmp = tmp.substring(i);

				if (tmp.length() < i) {
					if (count != 1)
						sb.append(count);
					sb.append(search).append(tmp);
					break;
				}

				String etc = tmp.substring(0, i);

				if (search.equals(etc)) {
					count++;
				} else {
					if (count != 1) {
						sb.append(count);
					}
					sb.append(search);
					count = 1;
				}
			}

			System.out.println(i + "�� : " + s + " => " + sb.toString());

			min = Math.min(min, sb.length());
		}

		return min;
	}

}
