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

		bfs(0, 0, map);

		return 0;

	}

	private static int bfs(int x, int y, int[][] map) {

		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == n - 1 && node.y == m - 1)
				return node.cost;
		}

		return 0;
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
