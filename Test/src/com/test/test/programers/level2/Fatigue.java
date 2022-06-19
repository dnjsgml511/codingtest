package com.test.test.programers.level2;

public class Fatigue {

	public static void main(String[] args) {

		int k = 80;
		int[][] dungeons = { { 80, 20 }, { 50, 40 }, { 30, 10 } };
		int result = 3;

		
		int sol = solution(k, dungeons);
		
		System.out.println(sol);
		
		System.out.println(sol == result);
	}

	static int solution(int k, int[][] dungeons) {
		boolean[] visited = new boolean[dungeons.length];
		min = 0;
		dfs(dungeons, visited, 0, 0, k);

		return min;
	}

	static int min;
	static void dfs(int[][] dungeons, boolean[] visited, int tmp, int count, int k) {

		for (int i = 0; i < dungeons.length; i++) {
			if (visited[i])
				continue;

			if (k < tmp + dungeons[i][0]) {
				continue;
			}

			visited[i] = true;
			count++;
			dfs(dungeons, visited, tmp + dungeons[i][1], count, k);
			count--;
			visited[i] = false;
		}

		min = Math.max(min, count);
	}

}
