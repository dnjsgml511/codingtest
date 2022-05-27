package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1212
public class EightToTwo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nums = br.readLine().split("");

		StringBuilder sb = new StringBuilder();
		for (int i = nums.length - 1; i >= 0; --i) {
			String a = Integer.toBinaryString(Integer.parseInt(nums[i]));
			sb.insert(0, a);
			if (a.length() == 2 && i != 0) {
				sb.insert(0, "0");
			} else if (a.length() == 1 && i != 0) {
				sb.insert(0, "00");
			}
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}
