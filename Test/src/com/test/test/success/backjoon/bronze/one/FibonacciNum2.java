package com.test.test.success.backjoon.bronze.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2748
public class FibonacciNum2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int target = Integer.parseInt(br.readLine());

		long before1 = 0, before2 = 1;
		for (int i = 1; i < target; i++) {
			long tmp = before2;
			before2 += before1;
			before1 = tmp;
		}
		
		bw.write(Long.toString(before2));

		bw.flush();
		bw.close();
	}

}
