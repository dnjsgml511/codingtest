package com.test.test.success.backjoon.gold.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CreatePassword {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		size = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());

		vowel = new ArrayList<>();
		vowel.add("a");
		vowel.add("e");
		vowel.add("i");
		vowel.add("o");
		vowel.add("u");

		
		String[] arr = new String[loop];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < loop; i++) {
			arr[i] = st.nextToken();
		}
		boolean[] visited = new boolean[loop];

		Arrays.sort(arr);
		backtracking(arr, visited, 0, size);

		bw.flush();
		bw.close();
	}

	static int size;
	static List<String> vowel;

	static void backtracking(String[] arr, boolean[] visited, int start, int r) {
		if (r == 0) {
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) {
					if (vowel.indexOf(arr[i]) != -1) {
						count++;
					}else {
						
					}
					sb.append(arr[i]);
				}
			}
			if (count >= 1 && count <= sb.length() - 2) {
				System.out.println(sb.toString());
			}
		}
		for (int i = start; i < arr.length; i++) {
			visited[i] = true;
			backtracking(arr, visited, i + 1, r - 1);
			visited[i] = false;
		}
	}
}

//3 5
//a e i b c