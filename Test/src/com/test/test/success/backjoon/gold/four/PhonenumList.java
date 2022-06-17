package com.test.test.success.backjoon.gold.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/5052
public class PhonenumList {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {

		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			String answer = func();
			bw.write(answer);
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

	static String func() throws Exception {
		int count = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(br.readLine());
		}

		Collections.sort(list);

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i + 1).startsWith(list.get(i))) {
				return "NO";
			}
		}

		return "YES";
	}
}
