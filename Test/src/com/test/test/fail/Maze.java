package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2178
public class Maze {

	static int[][] map;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		}

		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0, 0);
		bw.write(Integer.toString(map[n - 1][m - 1]));

		bw.flush();
		bw.close();
	}

	static void bfs(int x, int y) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] { x, y });

		while (!que.isEmpty()) {
			int[] now = que.poll();
			int nowx = now[0];
			int nowy = now[1];

			for (int i = 0; i < 4; i++) {
				int nextx = nowx + dx[i];
				int nexty = nowy + dy[i];

				if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= m) {
					continue;
				}
				if (visited[nextx][nexty] || map[nextx][nexty] == 0) {
					continue;
				}

				que.add(new int[] { nextx, nexty });
				map[nextx][nexty] = map[nowx][nowy] + 1;
				visited[nextx][nexty] = true;
			}
		}

	}
}

//4 6
//101111
//101010
//101011
//111011
