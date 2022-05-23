package com.test.test.success.backjoon.sliver.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class AtoB {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		BigInteger start = new BigInteger(line[0]);
		BigInteger end = new BigInteger(line[1]);

		dfs(start, end, 1);

		if (!answer) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(count));
		}

		bw.flush();
		bw.close();
	}

	static boolean answer = false;
	static int count = 0;

	static void dfs(BigInteger num, BigInteger end, int depth) {

		if (num.equals(end)) {
			answer = true;
			count = depth;
		}

		if (num.compareTo(end) == 1) {
			return;
		}

		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger ten = new BigInteger("10");
		dfs(num.multiply(two), end, depth + 1);
		dfs(num.multiply(ten).add(one), end, depth + 1);
	}

}
