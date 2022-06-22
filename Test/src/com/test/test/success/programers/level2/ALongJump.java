package com.test.test.success.programers.level2;

import java.math.BigInteger;

public class ALongJump {

	public static void main(String[] args) {

		int[] n = { 1 };
		long[] answer = { 1 };

		for (int i = 0; i < n.length; i++) {
			long sol = solution(n[i]);
			System.out.println(sol);
			if (answer[i] == sol) {
				System.out.println("Go");
			} else {
				System.out.println("Fail");
				return;
			}
		}
		System.out.println("Success");

	}

	static long solution(int n) {
		BigInteger[] visited = new BigInteger[n];
		count = 0;
		
		if(n == 1) {
			return 1;
		}
		
		visited[n - 1] = new BigInteger("1");
		visited[n - 2] = new BigInteger("2");
		dfs(visited, n - 3);
		
		return visited[0].remainder(new BigInteger("1234567")).intValue();
	}

	static int count;

	static void dfs(BigInteger[] visited, int site) {
		if(site <= -1) {
			return;
		}
		visited[site] = visited[site + 1].add(visited[site + 2]);
		dfs(visited, site - 1);
	}
}
