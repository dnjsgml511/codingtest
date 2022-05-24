package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RockGame {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int rock = Integer.parseInt(br.readLine());

		if (rock % 2 == 1) {
			bw.write("SK");
		} else {
			bw.write("CY");
		}

		bw.flush();
		bw.close();
	}
}
