package com.test.test.success.backjoon.bronze.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2475
public class VerificationNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0;
		while (st.hasMoreTokens())
			sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
		bw.write(Integer.toString(sum % 10));

		bw.flush();
		bw.close();
	}
}
