package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastSum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = Integer.parseInt(bf.readLine());

		int[] arr = new int[loop];
		for (int i = 1; i <= loop; i++) {
			String[] text= bf.readLine().split(" ");
			int first = Integer.parseInt(text[0]);
			int second = Integer.parseInt(text[1]);
			arr[i -1] = first + second;
		}
		
		for (int i : arr) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
