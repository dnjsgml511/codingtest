package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Collectors;

// https://www.acmicpc.net/problem/1021
public class TurnQueue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		int size = Integer.parseInt(line[0]);
		int wantsize = Integer.parseInt(line[1]);
		Deque<Integer> que = new ArrayDeque<>();
		for (int i = size - 1; i >= 0; --i)
			que.push(i + 1);

		line = br.readLine().split(" ");
		int count = 0;
		for (String data : line) {
			int num = Integer.parseInt(data);

			if (que.peekFirst() == num) {
				que.pollFirst();
				break;
			}

			Stack<Integer> leftstack = new Stack<>();
			Stack<Integer> rightstack = new Stack<>();

			while (que.isEmpty()) {
				int left = que.pollFirst();
				if (left == num) {
					while (leftstack.isEmpty())
						que.offerLast(leftstack.pop());
					while (rightstack.isEmpty())
						que.offerLast(rightstack.pop());
					break;
				}
				leftstack.push(left);

				int right = que.pollLast();
				if (right == num) {
					while (rightstack.isEmpty())
						que.offerFirst(rightstack.pop());
					while (leftstack.isEmpty())
						que.offerFirst(leftstack.pop());
					break;
				}
				rightstack.push(left);
				count++;

			}

			System.out.println(que);
		}

		System.out.println(count);

		bw.flush();
		bw.close();
	}

}

//10 3
//1 2 3

//10 3
//2 9 5
