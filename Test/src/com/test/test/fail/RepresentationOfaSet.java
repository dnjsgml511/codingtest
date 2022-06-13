package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1717
public class RepresentationOfaSet {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int box = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());

		parent = new int[box + 1];
		for (int i = 0; i <= box; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int type = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}

			if (type == 0) {
				union(a, b);
			} else {
				boolean check = isSameParent(a, b);
				if (check)
					bw.write("YES");
				else
					bw.write("NO");

				bw.write("\n");
			}

		}

		bw.flush();
		bw.close();
	}

	public static int[] parent;

	public static int find(int x) {
		if (x == parent[x])
			return x;
		else
			return parent[x] = find(parent[x]);
	}

	public static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x != y) {
			parent[y] = x;
		}
	}

	public static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return true;
		else
			return false;
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

//3 3
//0 1 2
//0 1 3
//1 2 3
