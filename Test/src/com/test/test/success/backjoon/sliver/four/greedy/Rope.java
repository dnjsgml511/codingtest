package com.test.test.success.backjoon.sliver.four.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rope {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		List<Integer> weights = new ArrayList<Integer>();
		for (int i = 0; i < loop; i++) {
			weights.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(weights, Collections.reverseOrder());

		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < loop; i++) {
			max = Math.max(max, (i + 1) * Math.min(min, weights.get(i)));
		}
		
		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();
	}

}
