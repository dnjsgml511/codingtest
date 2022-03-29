package com.test.test.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] map = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } }; // 11
//		int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};	//-1

		int sol = sol(map);

		System.out.println();
		System.out.println(sol);

	}

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static boolean[][] visited;
	static int n, m;

	private static int sol(int[][] map) {

		n = map.length;
		m = map[0].length;

		visited = new boolean[n][m];

		return bfs(0, 0, map);

	}

	private static int bfs(int x, int y, int[][] map) {

		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == n - 1 && node.y == m - 1)
				return node.cost;
			
			for(int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if(map[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new Node(nx, ny, node.cost + 1));
					}
				}
			}
		}

		return -1;
	}

	private static class Node {
		int x;
		int y;
		int cost;

		public Node(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
	}

}
