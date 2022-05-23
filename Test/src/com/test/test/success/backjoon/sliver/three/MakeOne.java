package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MakeOne {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		dfs(num, 0);

		bw.write(Integer.toString(min));

		bw.flush();
		bw.close();
	}

	static int min = Integer.MAX_VALUE;

	static void dfs(int num, int loop) {
		if (min < loop) {
			return;
		}
		if (num == 1) {
			min = Math.min(min, loop);
			return;
		} else if (num < 0) {
			return;
		}

		if (num % 3 == 0) {
			dfs(num / 3, loop + 1);
		}
		if (num % 2 == 0) {
			dfs(num / 2, loop + 1);
		}
		dfs(num - 1, loop + 1);
	}
}
