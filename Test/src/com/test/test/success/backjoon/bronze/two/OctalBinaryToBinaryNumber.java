package com.test.test.success.backjoon.bronze.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1212
public class OctalBinaryToBinaryNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();

		for (int i = 0; i < num.length(); i++) {
			String a = Integer.toBinaryString(num.charAt(i) - '0');
			if (a.length() == 2 && i != 0)
				a = "0" + a;
			else if(a.length() == 1 && i != 0)
				a = "00" + a;
			bw.write(a);
		}

		bw.flush();
		bw.close();
	}
}
