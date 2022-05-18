package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Zero1 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<Integer>();
		int loop = Integer.parseInt(bf.readLine());
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(bf.readLine());
			if (num != 0) {
				stack.add(num);
			} else {
				stack.pop();
			}
		}

		int sum = 0;
		for (int num : stack) {
			sum += num;
		}

		System.out.println(sum);
		
		bw.flush();
		bw.close();
	}

}
