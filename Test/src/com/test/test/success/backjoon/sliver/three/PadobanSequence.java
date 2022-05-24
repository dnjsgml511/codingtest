package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PadobanSequence {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			dp = new Long[num + 1];
			Long seq = sequence(num);
			bw.write(seq + "\n");
		}

		bw.flush();
		bw.close();
	}

	static Long[] dp;

	static Long sequence(int x) {
		if (x == 1 || x == 2 || x == 3)
			return (long) 1;
		if (dp[x] != null)
			return dp[x];
		dp[x] = sequence(x - 2) + sequence(x - 3);

		return dp[x];
	}

}
