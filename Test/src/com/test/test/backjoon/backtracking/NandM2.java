package com.test.test.backjoon.backtracking;

import java.util.Scanner;

public class NandM2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		dfs(sc.nextInt(), sc.nextInt());

		sc.close();
	}

	static void dfs(int num, int count) {
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;
		}
		boolean[] visited = new boolean[num];

		dfs(arr, visited, 0, count);
	}

	static void dfs(int[] arr, boolean[] visited, int start, int r) {
		if (r == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				if (visited[i])
					sb.append(arr[i]).append(" ");
			}
			System.out.println(sb.toString());
		}

		for (int i = start; i < arr.length; i++) {
			visited[i] = true;
			dfs(arr, visited, i + 1, r - 1);
			visited[i] = false;
		}
	}
}
