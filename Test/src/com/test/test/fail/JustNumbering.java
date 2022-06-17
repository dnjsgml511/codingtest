package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class JustNumbering {

	static boolean[][] visited;
	static int[][] arr;
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		visited = new boolean[N][N];

		System.out.println();
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}

		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}

		dfs(0, 0);

		bw.flush();
		bw.close();
	}

	static void dfs(int x, int y) {
		if (x >= N || y >= N) {
			return;
		}
		
		System.out.println(x + " / " + y);
	}

}

//7
//0110100
//0110101
//1110101
//0000111
//0100000
//0111110
//0111000