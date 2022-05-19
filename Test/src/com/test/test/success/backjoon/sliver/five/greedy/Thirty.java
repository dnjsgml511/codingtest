package com.test.test.success.backjoon.sliver.five.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Thirty {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nums = br.readLine().split("");

		Arrays.sort(nums);

		StringBuilder sb = new StringBuilder();
		for (String data : nums) {
			sb.append(data);
		}
		sb.reverse();

		BigInteger num = new BigInteger(sb.toString());
		BigInteger thirty = new BigInteger("30");
		BigInteger zero = new BigInteger("0");
		
		if(!num.remainder(thirty).equals(zero)) {
			bw.write("-1");
		}else {
			bw.write(sb.toString());
		}

		bw.flush();
		bw.close();
	}

}
