package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarReverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < loop-1; i++) {
			sb.append(" ");
		}
		for(int i = loop; i > 0; --i) {
			sb.delete(i-1, i);
			sb.insert(i-1, "*");
			bw.write(sb.toString() + "\n");
		}

		bw.flush();
		bw.close();
	}
}
