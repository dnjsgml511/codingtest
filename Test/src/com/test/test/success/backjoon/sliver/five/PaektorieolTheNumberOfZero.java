package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Stack;

// https://www.acmicpc.net/problem/1676
public class PaektorieolTheNumberOfZero {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		BigInteger sum = new BigInteger("1");
		BigInteger tmp = new BigInteger("0");
		for (int i = 1; i <= num; i++) {
			tmp = new BigInteger(Integer.toString(i));
			sum = sum.multiply(tmp);
		}
		
		String str = sum.toString();

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}

		int count = 0;
		while (!stack.isEmpty()) {
			char pop = stack.pop();
			if (pop == '0') {
				count++;
			} else {
				break;
			}
		}

		bw.write(Integer.toString(count));
		
		bw.flush();
		bw.close();
	}
}

// 10 - 2