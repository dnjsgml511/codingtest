package com.test.test.success.backjoon.sliver.four.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GasStation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()) - 1;
		int[] lens = new int[n];
		int[] prices = new int[n];

		String[] line = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			lens[i] = Integer.parseInt(line[i]);
		}

		line = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			prices[i] = Integer.parseInt(line[i]);
		}

		long before = Long.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			before = Math.min(before, prices[i]);
			sum += before * lens[i];
		}

		bw.write(Long.toString(sum));

		bw.flush();
		bw.close();
	}

}
