package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1051
public class NumSquare {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		arr = new int[x][y];

		for (int i = 0; i < x; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < y; j++) {
				arr[i][j] = Integer.parseInt(split[j]);
			}
		}

		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int min = Math.min(arr.length - i, arr[0].length - j);
				for (int k = 1; k < min; k++) {
					boolean check = check(i, j, k);
					if (check) {
						int sum = (int) Math.pow(k + 1, 2);
						max = Math.max(sum, max);
					}
				}
			}
		}
		
		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();
	}

	static int[][] arr;

	static boolean check(int x, int y, int len) {
		return xCheck(x, y, len) && yCheck(x, y, len) && crossCheck(x, y, len);
	}

	static boolean xCheck(int x, int y, int len) {
		return arr[x][y] == arr[x + len][y];
	}

	static boolean yCheck(int x, int y, int len) {
		return arr[x][y] == arr[x][y + len];
	}

	static boolean crossCheck(int x, int y, int len) {
		return arr[x][y] == arr[x + len][y + len];
	}
}

//3 5
//42101
//22100
//22101