package com.test.test.success.backjoon.bronze.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2752
public class SortNum3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		List<Integer> list = new ArrayList<>();
		while (st.hasMoreTokens())
			list.add(Integer.parseInt(st.nextToken()));

		Collections.sort(list);

		StringBuilder sb = new StringBuilder();
		for (int data : list)
			sb.append(data).append(" ");

		sb.setLength(sb.length() - 1);
		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}
