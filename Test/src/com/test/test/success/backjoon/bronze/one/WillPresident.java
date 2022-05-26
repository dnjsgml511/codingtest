package com.test.test.success.backjoon.bronze.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/2775
public class WillPresident {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		int floormax = 0;
		int nextmax = 0;

		List<int[]> list = new ArrayList<>();

		for (int i = 0; i < loop; i++) {
			int floor = Integer.parseInt(br.readLine());
			int next = Integer.parseInt(br.readLine());
			int[] tmp = { floor, next };
			list.add(tmp);

			floormax = Math.max(floormax, floor);
			nextmax = Math.max(nextmax, next);
		}
		int[][] arr = new int[floormax + 1][nextmax];

		for (int i = 0; i < nextmax; i++) {
			arr[0][i] = i + 1;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int before = j == 0 ? 0 : arr[i][j - 1];
				int bottom = arr[i - 1][j];
				arr[i][j] = before + bottom;
			}
		}
		for (int[] data : list) {
			bw.write(Integer.toString(arr[data[0]][data[1] - 1]));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}

//2
//1
//3
//2
//3