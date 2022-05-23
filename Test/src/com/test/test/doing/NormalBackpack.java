package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NormalBackpack {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int loop = Integer.parseInt(st.nextToken());
		max = Integer.parseInt(st.nextToken());

		weight = new int[loop];
		value = new int[loop];
		for (int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}

//		dfs(0, 0);

		bw.flush();
		bw.close();
	}

	static int max;
	static int[] weight, value;

	static void dfs(int sum ) {

	}

}

//4 7
//6 13
//4 8
//3 6
//5 12