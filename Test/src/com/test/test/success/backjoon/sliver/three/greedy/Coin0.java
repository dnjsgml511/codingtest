package com.test.test.success.backjoon.sliver.three.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Coin0 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		int loop = Integer.parseInt(line[0]);
		int target = Integer.parseInt(line[1]);

		List<Integer> coins = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			coins.add(Integer.parseInt(br.readLine()));
		}

		int count = 0;
		for (int i = coins.size() - 1; i >= 0; --i) {
			int coin = target / coins.get(i);
			target -= coin * coins.get(i);
			count += coin;
		}
		
		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();
	}

}
