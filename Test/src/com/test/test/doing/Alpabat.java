package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1987
public class Alpabat {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		height = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());

		map = new String[height][width];
		for (int i = 0; i < height; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < width; j++) {
				map[i][j] = split[j];
			}
		}

		bw.flush();
		bw.close();
	}

	static String[][] map;
	static int height, width;

	static void moveSide(List<String> history, int x, int y) {
		if(x > width) {
			return;
		}
	}

	static void moveHeight(List<String> history, int x, int y) {
	}
}
