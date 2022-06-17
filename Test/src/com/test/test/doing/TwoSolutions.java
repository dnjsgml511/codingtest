package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2470
public class TwoSolutions {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		List<Integer> solutions = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < count; i++)
			solutions.add(Integer.parseInt(st.nextToken()));

		Collections.sort(solutions);

		int front = 0, back = count - 1, min = Integer.MAX_VALUE;
		int fronttmp = 0, backtmp = 0;
		while (front != back) {
			int frontGet = solutions.get(front);
			int backGet = solutions.get(back);
			int sum = Math.abs(frontGet + backGet);

			if (min < sum) {
				break;
			} else {
				min = sum;
			}

			if (sum > 0) {
				front++;
			} else {
				back--;
			}
			
			fronttmp = frontGet;
			backtmp = backGet;
		}
		
		bw.write(Integer.toString(fronttmp));
		bw.write(" ");
		bw.write(Integer.toString(backtmp));

		bw.flush();
		bw.close();
	}
}

//6
//-2 4 -99 -1 98 -1000