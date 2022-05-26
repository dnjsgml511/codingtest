package com.test.test.success.backjoon.bronze.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10953
public class APlusB6 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			bw.write(Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}
