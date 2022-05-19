package com.test.test.success.backjoon.sliver.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class NewRecruit {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			int[][] arr = new int[num][2];
			for (int j = 0; j < num; j++) {
				String[] split = br.readLine().split(" ");
				arr[j][0] = Integer.parseInt(split[0]);
				arr[j][1] = Integer.parseInt(split[1]);
			}

			Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));
			
			int max = Integer.MAX_VALUE, count = 0;
			for (int[] js : arr) {
				if(max > js[1]) {
					count++;
					max = js[1];
				}
				
			}
			bw.write(Integer.toString(count));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}
