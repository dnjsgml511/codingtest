package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < loop; i++) {
			sb.append("*");
			bw.write(sb.toString() + "\n");
		}

		bw.flush();
		bw.close();
	}
}
