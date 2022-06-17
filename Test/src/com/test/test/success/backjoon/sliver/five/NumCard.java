package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10815
public class NumCard {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int havecount = Integer.parseInt(br.readLine());

		HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < havecount; i++) {
			String token = st.nextToken();
			map.put(token, map.getOrDefault(token, 0) + 1);
		}

		List<String> search = new ArrayList<>();
		int searchcount = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < searchcount; i++)
			search.add(st.nextToken());

		for (String data : search) {
			bw.write(Integer.toString(map.getOrDefault(data, 0)));
			bw.write(" ");
		}

		bw.flush();
		bw.close();
	}

}
