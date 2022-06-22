package com.test.test.success.backjoon.gold.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class CartSort {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i = 0; i < loop; i++) {
			que.add(Integer.parseInt(br.readLine()));
		}
		
		int all = 0;
		while (que.size() != 1) {
			int sum = que.poll() + que.poll();
			all += sum;
			que.add(sum);
		}
		bw.write(Integer.toString(all));
		bw.flush();
		bw.close();
	}
}
