package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		int[] arr = new int[loop];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < loop; i++)
			arr[i] = Integer.parseInt(br.readLine());

		int j = 0;
		for (int i = 1; i <= loop; i++) {
			stack.push(i);
			bw.write("+\n");
			
			while (!stack.isEmpty() && stack.peek() == arr[j] && j < loop) {
				stack.pop();
				bw.write("-\n");
				j++;
			}
		}

		if(!stack.isEmpty()) {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("NO");
		}
		
		bw.flush();
		bw.close();

	}
}
