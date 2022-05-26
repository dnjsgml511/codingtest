package com.test.test.success.backjoon.bronze.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10250
public class AMCHotel {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < cases; i++) {
			String[] split = br.readLine().split(" ");
			int height = Integer.parseInt(split[0]);
			int width = Integer.parseInt(split[1]);
			int num = Integer.parseInt(split[2]);

			int condition = num % height;
			int floor = condition == 0 ? height * 100 : condition * 100;

			int next = condition == 0 ? num / height : num / height + 1;
			bw.write(Integer.toString(floor + next));
			bw.write("\n");

		}

		bw.flush();
		bw.close();
	}
}

//1
//1 1 1

//4
//6 12 10
//30 50 72
//6 6 6
//6 6 12
