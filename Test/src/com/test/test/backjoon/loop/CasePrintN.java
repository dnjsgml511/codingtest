package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CasePrintN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(bf.readLine());

		int[] arr = new int[loop];
		int[][] nums = new int[loop][2];
		for (int i = 1; i <= loop; i++) {
			String[] text = bf.readLine().split(" ");
			int first = Integer.parseInt(text[0]);
			int second = Integer.parseInt(text[1]);
			arr[i - 1] = first + second;
			nums[i-1][0] = first;
			nums[i-1][1] = second;
		}

		for (int i = 0; i < arr.length; i++) {
			bw.write("Case #" + (i + 1) + ": " + nums[i][0] + " + " + nums[i][1] + " = " +  + arr[i] + "\n");
		}

		bw.flush();
		bw.close();
	}
}