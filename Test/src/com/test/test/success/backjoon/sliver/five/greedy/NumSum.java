package com.test.test.success.backjoon.sliver.five.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long num = Long.parseLong(br.readLine());
		long tmp = 1;

		int count = 0;
		while (num >= 0) {
			num -= tmp++;
			count++;
		}

		bw.write(Integer.toString(count - 1));
		
		bw.flush();
		bw.close();
	}
}
