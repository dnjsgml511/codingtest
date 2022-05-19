package com.test.test.success.backjoon.sliver.three.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ATM {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String[] strtimes = br.readLine().split(" ");
		List<Integer> times = new ArrayList<>();
		for (int i = 0; i < num; i++) 
			times.add(Integer.parseInt(strtimes[i]));
		
		Collections.sort(times);

		int sum = 0;
		while (num != 0) {
			sum += times.remove(0) * (num--);
		}

		bw.write(Integer.toString(sum));

		bw.flush();
		bw.close();
	}

}
