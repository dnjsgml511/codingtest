package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// https://www.acmicpc.net/problem/9613
public class GCDSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			String[] line = br.readLine().split(" ");
			int[] arr = new int[line.length - 1];
			for (int j = 1; j <= arr.length; j++) {
				arr[j - 1] = Integer.parseInt(line[j]);
			}

			long sum = 0;
			for (int j = 0; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum += gcd(arr[j], arr[k]);
				}
			}

			bw.write(sum + "\n");
		}

		bw.flush();
		bw.close();
	}

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}

//3
//4 10 20 30 40
//3 7 5 12
//3 125 15 25