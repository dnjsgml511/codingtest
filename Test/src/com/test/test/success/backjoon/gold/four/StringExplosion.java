package com.test.test.success.backjoon.gold.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/9935
public class StringExplosion {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String origin = br.readLine();
		String bomb = br.readLine();
		
		int oriLen = origin.length();
		int bomLen = bomb.length();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < oriLen; i++) {
			char c = origin.charAt(i);
			sb.append(c);

			if (sb.length() >= bomLen) {
				String cut = sb.substring(sb.length() - bomLen, sb.length());
				if (cut.equals(bomb)) {
					sb.delete(sb.length() - bomb.length(), sb.length());
				}
			}
		}

		if (sb.length() == 0) {
			System.out.println("FRULA");
		} else {
			System.out.println(sb.toString());
		}

		bw.flush();
		bw.close();
	}
}

//mirkovC4nizCC44
//C4

// mirkovniz
