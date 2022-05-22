package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Blance {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] arr = new int[loop];
		boolean[] visited = new boolean[loop];

		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(line[i]);
			arr[i] = num;
		}

		


		bw.flush();
		bw.close();
	}

	static List<Integer> list;


}
