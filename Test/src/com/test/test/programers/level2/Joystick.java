package com.test.test.programers.level2;

import java.util.ArrayList;
import java.util.List;

public class Joystick {

	public static void main(String[] args) {
//		String name = "JEROEN"; // 56
//		String name = "JAN"; // 23

//		String name = "BBABAAAABBBAAAABABB";// 26
//		String name = "BBAAAAAABBBAAAAAABB";// 20
//		String name = "BBBAAAAAAAB";// 8
//		String name = "ABAAAAAAAAABB";// 7
//		String name = "BBAABB";// 8
//		String name = "BBBAAAAABAAAAAAAAAAA";// 12
//		String name = "BAAAAAAAAAABAAAAAABB";// 13
		String name = "AAABBAB";// 7

		int sol = sol(name);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(String name) {

		int answer = 0;
		int len = name.length();
		int min = len - 1;

		for (int i = 0; i < len; i++) {
			char c = name.charAt(i);
			int mov = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);

			answer += mov;

			int nextIndex = i + 1;
			while(nextIndex < len && name.charAt(nextIndex) == 'A') {
				nextIndex++;
			}
			
			min = Math.min(min, (i * 2) + len - nextIndex);
			System.out.println(min);

		}
		
		answer += min;

		return answer;
	}
}
