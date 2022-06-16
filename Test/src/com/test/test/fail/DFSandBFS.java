package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1260
public class DFSandBFS {

	static boolean[] DFSvisited;
	static boolean[] BFSvisited;
	static int[][] graph;
	static StringBuilder DFSsb, BFSsb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int spot = Integer.parseInt(st.nextToken());
		int load = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		System.out.println();
		System.out.println();

		DFSvisited = new boolean[spot + 1];
		BFSvisited = new boolean[spot + 1];
		DFSsb = new StringBuilder();
		BFSsb = new StringBuilder();

		graph = new int[spot + 1][load + 1];

		for (int i = 0; i < load; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());

			graph[node1][node2] = 1;
			graph[node2][node1] = 1;
		}

		dfs(start);
		System.out.println(DFSsb.toString());

		bfs(start);
		System.out.println(BFSsb.toString());

		bw.flush();
		bw.close();
	}

	static void dfs(int start) {
		DFSvisited[start] = true;
		DFSsb.append(start).append(" ");
		if (start == graph.length) {
			return;
		}

		for (int i = 1; i < graph.length; i++) {
			if (graph[start][i] == 1 && DFSvisited[i] == false) {
				dfs(i);
			}
		}
	}

	static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();

		que.add(start);
		BFSvisited[start] = true;

		BFSsb.append(start).append(" ");

		System.out.println();
		while (!que.isEmpty()) {
			int tmp = que.poll();
			for (int i = 1; i < graph.length; i++) {
				if (graph[tmp][i] == 1 && BFSvisited[i] == false) {
					que.add(i);
					BFSvisited[i] = true;
					BFSsb.append(i).append(" ");
				}
			}
			System.out.println();
		}
	}
}

//5 5 3
//5 4
//5 2
//1 2
//3 4
//3 1

//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4
