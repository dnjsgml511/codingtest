package com.test.test.success.backjoon.sliver.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Lotto {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String line = br.readLine();
			if (line.equals("0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(line, " ");
			int[] arr = new int[Integer.parseInt(st.nextToken())];
			boolean[] visited = new boolean[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			backtracking(arr, visited, 0, 6);
			System.out.println();
		}

		bw.flush();
		bw.close();
	}

	static void backtracking(int[] arr, boolean[] visited, int start, int r) {
		if (r == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) {
					sb.append(arr[i]).append(" ");
				}
			}
			String str = sb.toString().substring(0, sb.length() - 1);
			System.out.println(str);
		}
		for (int i = start; i < arr.length; i++) {
			visited[i] = true;
			backtracking(arr, visited, i + 1, r - 1);
			visited[i] = false;
		}
	}

}
