package com.test.test.success.backjoon.sliver.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10816
public class NumCard2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		br.readLine();
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			bw.write(Integer.toString(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)));
			bw.write(" ");
		}

		bw.flush();
		bw.close();
	}
}
