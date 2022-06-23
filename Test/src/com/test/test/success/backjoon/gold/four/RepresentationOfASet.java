package com.test.test.success.backjoon.gold.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1717
public class RepresentationOfASet {

	static int[] parent;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());

		parent = new int[N+1];
		for (int i = 0; i <= N; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int type = Integer.parseInt(st.nextToken());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			if (type == 0) {
				union(num1, num2);
			} else {
				if (isSameParent(num1, num2)) {
					bw.write("YES");
				} else {
					bw.write("NO");
				}
				bw.write("\n");
			}
		}

		bw.flush();
		bw.close();
	}

	static int find(int x) {
		if (x == parent[x])
			return x;
		else
			return parent[x] = find(parent[x]);
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			parent[y] = x;
		} else {
			parent[x] = y;
		}
	}

	static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}
}

//7 8
//0 1 3
//1 1 7
//0 7 6
//1 7 1
//0 3 7
//0 4 2
//0 1 1
//1 1 1