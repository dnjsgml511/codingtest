package com.test.test.success.backjoon.gold.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2470
public class TwoSolutions {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 0;
		while (st.hasMoreTokens()) {
			arr[index++] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int[] tmp = new int[2];
		int front = 0, back = arr.length - 1, min = Integer.MAX_VALUE;
		while (front < back) {
			if (min > Math.abs(arr[front] + arr[back])) {
				min = Math.abs(arr[front] + arr[back]);
				tmp[0] = arr[front];
				tmp[1] = arr[back];
			}

			if (arr[front] + arr[back] > 0) {
				back--;
			} else {
				front++;
			}
		}

		for (int data : tmp) {
			bw.write(Integer.toString(data));
			bw.write(" ");
		}

		bw.flush();
		bw.close();
	}
}

//6
//-502 -80 -60 23 100 1002

//6
//-2 4 -99 -1 98 1000