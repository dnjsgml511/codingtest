package com.test.test.success.backjoon.bronze.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/5543
public class SanggeenNald {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(Integer.toString(Math.min(Integer.parseInt(br.readLine()),
				Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())))
				+ Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())) - 50));

		bw.flush();
		bw.close();
	}

}
