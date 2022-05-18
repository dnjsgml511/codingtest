package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = Integer.parseInt(bf.readLine());
		
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < loop; i++) {
			String line = bf.readLine();
			String type = line.split(" ")[0];

			switch (type) {
			case "push":
				stack.push(line.split(" ")[1]);
				break;
			case "pop":
				if (stack.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) 
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "top":
				if(stack.size() == 0) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
				break;
			default:
				break;
			}

		}
		
		bw.flush();
		bw.close();
	}
}
