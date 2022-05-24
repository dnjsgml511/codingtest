package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1699
public class SquareSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int want = Integer.parseInt(br.readLine());

		int count = 0;
		while (want != 0) {
			System.out.println(want + " / " + (int)Math.sqrt(want));
			want -= Math.pow((int) Math.sqrt(want), 2);
			count++;
		}

		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();
	}
}
