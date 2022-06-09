package com.test.test.success.backjoon.sliver.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class MinHeap {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (que.size() == 0) {
					bw.write("0\n");
				} else {
					int remove = que.poll();
					bw.write(Integer.toString(remove));
					bw.write("\n");
				}
			} else {
				que.add(num);
			}
		}

		bw.flush();
		bw.close();
	}
}
