package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1676
public class FactoralZeroCount {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int sum = 1, count = 0;
		for (int i = 1; i <= num; i++) {
			sum *= i;
			if (sum % 10 == 0) {
				count++;
				sum = sum / 10;
			}
			String str = Integer.toString(sum);
			sum = Integer.parseInt(str.substring(str.length() - 1));
		}


		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	}
}
