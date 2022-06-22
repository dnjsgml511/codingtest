package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2437
public class ABalance {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		int[] arr = new int[loop];
		boolean[] visited = new boolean[loop];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 0;
		while (st.hasMoreTokens())
			arr[index++] = Integer.parseInt(st.nextToken());

		map = new HashMap<>();

		int[] output = new int[arr.length];
		permutation(arr, output, visited, 0, arr.length, arr.length);

		int check = 1;

		while (true) {
			if (!map.getOrDefault(check, false)) {
				break;
			} else {
				check++;
			}
		}

		bw.write("\n");
		bw.write(Integer.toString(check));

		bw.flush();
		bw.close();
	}

	static HashMap<Integer, Boolean> map;

	public static void permutation(int[] array, int[] output, boolean[] isVisit, int depth, int length, int count) {
		if (count == 0) {

			int sum = 0;
			for (int i = 0; i < output.length; i++) {
				sum += output[i];
				map.put(sum, true);
			}

			return;
		}
		for (int i = 0; i < length; i++) {
			if (isVisit[i] != true) {
				isVisit[i] = true;
				output[depth] = array[i];
				permutation(array, output, isVisit, depth + 1, length, count - 1);
				isVisit[i] = false;
			}
		}
	}
}

//7
//3 1 6 2 7 30 1