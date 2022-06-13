package com.test.test.success.backjoon.sliver.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

// https://www.acmicpc.net/problem/11279
public class MaxHeep {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			que.offer(num);

			if (num == 0) {
				bw.write(Integer.toString(que.poll()));
				bw.write("\n");
			}
		}

		bw.flush();
		bw.close();
	}

}
