package com.test.test.doing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(br.readLine());

		int[] arr = new int[loop];
		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			max = Math.max(max, num);
			min = Math.min(min, num);
			arr[i] = num;
		}

		int gap = (max + min) / loop;
		int pop = max;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num == pop) {
				stack.pop();
				System.out.println("-");
				pop -= gap;
				while(pop == stack.peek()) {
					stack.pop();
					pop -= gap;
					System.out.println("-");
				}
			} else {
				stack.push(num);
				System.out.println("+");
			}
		}
	}

}
