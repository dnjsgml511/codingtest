package com.test.test.backjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NandM3 {

	static int n, m;
	static int[] ans;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);

		ans = new int[m];
		dfs(0);
	}

	static void dfs(int depth) {
		if (depth == m) {
			StringBuilder sb = new StringBuilder();
			for (int a : ans)
				sb.append(a).append(" ");
			System.out.println(sb.toString());
			return;
		}
		for (int i = 1; i <= n; i++) {
			ans[depth] = i;
			dfs(depth + 1);
		}
	}
}
