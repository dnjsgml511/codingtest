package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InsertOperator {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 0;
		while (st.hasMoreElements())
			arr[index++] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		symbols = new int[4];
		for (int i = 0; i < 4; i++)
			symbols[i] = Integer.parseInt(st.nextToken());

		dfs(arr[0], 1);

		System.out.println(max + " / " + min);

		bw.flush();
		bw.close();

		System.out.println("end");
	}

	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, N;
	static int[] symbols, arr;

	static void dfs(int num, int idx) {
		if (idx == N) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (symbols[i] > 0) {
				symbols[i]--;

				switch (i) {
				case 0:
					dfs(num + arr[idx], idx + 1);
					break;
				case 1:
					dfs(num - arr[idx], idx + 1);
					break;
				case 2:
					dfs(num * arr[idx], idx + 1);
					break;
				case 3:
					dfs(num / arr[idx], idx + 1);
					break;

				default:
					break;
				}

				symbols[i]++;
			}
		}
	}

}

//6
//1 2 3 4 5 6
//2 1 1 1
