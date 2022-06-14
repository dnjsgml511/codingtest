package com.test.test.success.backjoon.gold.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17298
public class RightBigNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[loop];
		int index = 0;
		while (st.hasMoreTokens()) {
			arr[index++] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < loop; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
				continue;
			}

			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int data : arr)
			sb.append(data).append(" ");

		sb.setLength(sb.length() - 1);
		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}

//7
//4 3 2 1 2 3 4

//10
//1 3 6 9 12 2 5 10 15 20

//4
//3 5 2 7

//4
//9 5 4 8
