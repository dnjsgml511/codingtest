package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class JosephusProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		int loop = Integer.parseInt(line[0]);
		int pop = Integer.parseInt(line[1]);

		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i = loop; i > 0; --i) {
			deque.push(i);
		}

		int[] answer = new int[loop];
		int index = 0;
		while (!deque.isEmpty()) {
			for (int i = 0; i < pop - 1; i++) {
				deque.offerLast(deque.pollFirst());
			}
			answer[index++] = deque.pollFirst();
		}

		bw.write("<");
		StringBuilder sb = new StringBuilder();
		for (int data : answer)
			sb.append(data).append(", ");
		sb.setLength(sb.length() - 2);
		bw.write(sb.toString());
		bw.write(">");

		bw.flush();
		bw.close();
	}
}
