package com.test.test.success.backjoon.sliver.four;

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
		int len = Integer.parseInt(line[0]);
		int step = Integer.parseInt(line[1]);

		Deque<Integer> que = new LinkedList<>();
		for (int i = 0; i < len; i++) {
			que.offerLast(i + 1);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (!que.isEmpty()) {
			for (int i = 0; i < step - 1; i++) {
				que.offerLast(que.pollFirst());
			}
			sb.append(que.pollFirst()).append(", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");

		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}

}
