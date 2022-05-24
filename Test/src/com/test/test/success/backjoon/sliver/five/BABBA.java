package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BABBA {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int A = 1, B = 0;

		for (int i = 0; i < count; i++) {
			int tmp = A;
			A = B;
			B += tmp;
		}

		bw.write(Integer.toString(A));
		bw.write(" ");
		bw.write(Integer.toString(B));

		bw.flush();
		bw.close();
	}
}
