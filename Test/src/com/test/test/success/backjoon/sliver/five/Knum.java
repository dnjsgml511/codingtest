package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Knum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = Integer.parseInt(st.nextToken());
		int depth = Integer.parseInt(st.nextToken()) - 1;

		st = new StringTokenizer(br.readLine(), " ");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			list.add(num);
		}

		Collections.sort(list);

		bw.write(Integer.toString(list.get(depth)));

		bw.flush();
		bw.close();
	}

}
