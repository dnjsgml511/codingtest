package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1037
public class Divisor {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		long[] arr = new long[loop];
		String[] split = br.readLine().split(" ");

		for (int i = 0; i < loop; i++) {
			arr[i] = Long.parseLong(split[i]);
		}

		if (loop == 1) {
			bw.write(Long.toString(arr[0] * arr[0]));
		} else {

			Arrays.sort(arr);

			long first = arr[arr.length - 1];
			long second = arr[arr.length - 2];

			long gcd = first * second / gcd(first, second);

			if (gcd == first) {
				bw.write(Long.toString(gcd * arr[0]));
			} else {
				bw.write(Long.toString(gcd));
			}
		}

		bw.flush();
		bw.close();
	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

}
