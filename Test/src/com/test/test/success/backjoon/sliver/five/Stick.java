package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Stick {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int want = Integer.parseInt(br.readLine());

		bw.write(Integer.toString(makeTwo(want)));

		bw.flush();
		bw.close();
	}

	static int makeTwo(int num) {
		StringBuilder sb = new StringBuilder();
		while (num != 0) {
			sb.append(num % 2);
			num /= 2;
		}

		char[] split = sb.toString().toCharArray();
		int count = 0;
		for (char data : split) {
			if (data == '1') {
				count++;
			}
		}
		return count;
	}

}
