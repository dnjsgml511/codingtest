package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2437
public class ABalance {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		int[] arr = new int[loop];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int index = 0;
		while (st.hasMoreTokens())
			arr[index++] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);

		int sum = 0;
		for (int i = 0; i < loop; i++) {
			System.out.println(sum + " / " + arr[i]);
			if (sum + 1 < arr[i]) 
				break;
			sum += arr[i];
		}

		bw.flush();
		bw.close();
	}
}

//7
//3 1 6 2 7 30 1