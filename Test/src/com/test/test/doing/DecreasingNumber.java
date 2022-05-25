package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// https://www.acmicpc.net/problem/1038
public class DecreasingNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int index = 0;;
		while(num == index) {
			index = nextnum(index++);
		}
		
		bw.flush();
		bw.close();
	}

	static int count = 0;
	static int nextnum(int num) {

		boolean check = check(num + 1);

		if (check) {
			count++;
			return num + 1;
		} else {
			String str = Integer.toString(num);
			String first = Integer.toString(Integer.parseInt(str.substring(0, 1)) + 1);
			StringBuilder sb = new StringBuilder();
			sb.append(first);
			for (int i = 1; i < str.length(); i++) {
				sb.append("0");
			}
			return Integer.parseInt(sb.toString());
		}
	}

	static boolean check(int num) {
		String str = Integer.toString(num);
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i++) {
			int first = arr[i];
			int second = arr[i + 1];
			if (first <= second) {
				return false;
			}
		}

		return true;
	}
}
