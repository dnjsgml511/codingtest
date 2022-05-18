package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Que1 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(bf.readLine());

		Deque<String> que = new LinkedList<String>();
		for (int i = 0; i < loop; i++) {
			String line = bf.readLine();
			String type = line.split(" ")[0];

			switch (type) {
			case "push":
				que.push(line.split(" ")[1]);
				break;
			case "pop":
				if (que.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(que.pollLast());
				}
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				System.out.println(que.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(que.isEmpty() ? -1 : que.getLast());
				break;
			case "back":
				System.out.println(que.isEmpty() ? -1 : que.getFirst());
				break;

			default:
				break;
			}
		}

		bw.flush();
		bw.close();
	}

}
