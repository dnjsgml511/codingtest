package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NandM3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		length = M;

		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = i + 1;

		permutation(0, "");

		bw.flush();
		bw.close();
	}

	static BufferedWriter bw;
	static int[] arr;
	static int length;

	static void permutation(int loop, String view) throws IOException {
		if (loop == length) {
			bw.write(view.substring(1));
			bw.write("\n");
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			permutation(loop + 1, view + " " + arr[i]);
		}
	}
}
