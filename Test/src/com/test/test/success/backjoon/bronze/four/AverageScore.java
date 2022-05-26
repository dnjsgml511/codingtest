package com.test.test.success.backjoon.bronze.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10039
public class AverageScore {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num <= 40 ? 40 : num;
		}
		
		bw.write(Integer.toString(sum / 5));
		
		bw.flush();
		bw.close();
	}

}
