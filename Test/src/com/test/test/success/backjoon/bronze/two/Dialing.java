package com.test.test.success.backjoon.bronze.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/5622
public class Dialing {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] words = br.readLine().split("");

		int count = 0;
		for (String word : words) {
			int num = word.charAt(0) - 'A';

			if (num < 3)
				count += 3;
			else if (num < 6)
				count += 4;
			else if (num < 9)
				count += 5;
			else if (num < 12)
				count += 6;
			else if (num < 15)
				count += 7;
			else if (num < 19)
				count += 8;
			else if (num < 22)
				count += 9;
			else
				count += 10;

		}

		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	}
}
