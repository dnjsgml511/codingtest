package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/13301
public class ATiledOrnament {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		if (num == 1) {
			bw.write("4");
		} else if (num == 2) {
			bw.write("6");
		} else if (num == 3) {
			bw.write("10");
		} else {

			long[] arr = new long[num];
			arr[0] = arr[1] = 1;

			long x = 2;
			long y = 1;
			for (int i = 2; i < num; i++) {
				arr[i] = x;
				x = x + y;
				y = arr[i];
			}

			int len = arr.length;
			long answer = arr[len - 1] * 3 + arr[len - 2] * 2 + arr[len - 3] * 2 + arr[len - 4];

			bw.write(Long.toString(answer));
		}

		bw.flush();
		bw.close();
	}

}
