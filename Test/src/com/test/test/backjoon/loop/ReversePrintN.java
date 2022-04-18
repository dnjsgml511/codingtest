package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReversePrintN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = Integer.parseInt(bf.readLine());

		for (int i = loop; i >= 1; i--) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
