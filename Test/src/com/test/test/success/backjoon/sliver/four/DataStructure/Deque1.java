package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		Deque<String> deque = new LinkedList<String>();
		for (int i = 0; i < loop; i++) {
			String[] line = br.readLine().split(" ");
			
			switch (line[0]) {
			case "push_front":
				deque.offerFirst(line[1]);
				break;
			case "push_back":
				deque.offerLast(line[1]);
				break;
			case "pop_front":
				bw.write(deque.isEmpty() ? "-1" : deque.pollFirst());
				bw.write("\n");
				break;
			case "pop_back":
				bw.write(deque.isEmpty() ? "-1" : deque.pollLast());
				bw.write("\n");
				break;
			case "size":
				bw.write(Integer.toString(deque.size()));
				bw.write("\n");
				break;
			case "empty":
				bw.write(deque.isEmpty() ? "1" : "0");
				bw.write("\n");
				break;
			case "front":
				bw.write(deque.isEmpty() ? "-1" : deque.peekFirst());
				bw.write("\n");
				break;
			case "back":
				bw.write(deque.isEmpty() ? "-1" : deque.peekLast());
				bw.write("\n");
				break;
			default:
				break;
			}
		}

		bw.flush();
		bw.close();
	}

}
