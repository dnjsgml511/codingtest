package com.test.test.success.backjoon.bronze.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2747
public class FibonacciNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int target = Integer.parseInt(br.readLine());

		int A = 0, B = 1;
		for (int i = 1; i < target; i++) {
			int tmp = B;
			B += A;
			A = tmp;
		}

		bw.write(Integer.toString(B));

		bw.flush();
		bw.close();
	}

}
