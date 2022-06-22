package com.test.test.success.programers.level2;

import java.util.Arrays;

public class Delivery {
	// 플로이드 와샬 알고리즘
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[][] road = { { 1, 2, 1 }, { 2, 3, 3 }, { 5, 2, 2 }, { 1, 4, 2 }, { 5, 3, 1 }, { 5, 4, 2 } };
		int K = 3; // 4
		int sol = sol(N, road, K);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(int N, int[][] road, int K) {

		int[][] map = new int[N][N];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (i == j) {
					map[i][j] = 0;
					continue;
				}
				map[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < road.length; i++) {
			if (map[road[i][0] - 1][road[i][1] - 1] < road[i][2]) {
				continue;
			}
			map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
			map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
		}

		int count = 0;
		for (int i = 0; i < map.length; i++) {
			if (map[0][i] <= K)
				count++;

		}

		return count;
	}

}
