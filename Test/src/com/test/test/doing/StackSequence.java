package com.test.test.doing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int loop = Integer.parseInt(br.readLine());

		int[] arr = new int[loop];
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}

		Character[] answer = new Character[loop * 2];
		
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < loop; i++) {
			for(int j = 1; j < i; j++) {
				
			}
			
			System.out.println("-");
		}

	}
}
