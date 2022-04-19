package com.test.test.backjoon.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaxMin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(bf.readLine());

		String[] nums = bf.readLine().split(" ");
		int max = -1000000, min = 1000000;
		for (int i = 0; i < size; i++) {
			max = Math.max(max, Integer.parseInt(nums[i]));
			min = Math.min(min, Integer.parseInt(nums[i]));
		}

		bw.write(min + " " + max);

		bw.flush();
		bw.close();
	}
}
