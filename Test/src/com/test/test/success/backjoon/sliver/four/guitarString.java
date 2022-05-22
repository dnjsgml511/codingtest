package com.test.test.success.backjoon.sliver.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class guitarString {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = br.readLine();
		String[] split = line.split(" ");

		int want = Integer.parseInt(split[0]);
		int brand = Integer.parseInt(split[1]);

		int[] packages = new int[brand];
		int[] etc = new int[brand];

		for (int i = 0; i < brand; i++) {
			String[] tmp = br.readLine().split(" ");
			packages[i] = Integer.parseInt(tmp[0]);
			etc[i] = Integer.parseInt(tmp[1]);

			if (packages[i] > etc[i] * 6) {
				packages[i] = etc[i] * 6;
			}
		}

		Arrays.sort(packages);
		Arrays.sort(etc);

		int six = packages[0];
		int one = etc[0];

		int sixret = want / 6 * six;
		int oneret = want % 6 * one;

		if (oneret > six) {
			sixret += six;
			oneret = 0;
		}

		int sum = sixret + oneret;

		bw.write(Integer.toString(sum));

		bw.flush();
		bw.close();
	}
}
