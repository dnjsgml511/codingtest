package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		int[][] meet = new int[loop][2];

		for (int i = 0; i < loop; i++) {
			String[] line = br.readLine().split(" ");
			meet[i][0] = Integer.parseInt(line[0]);
			meet[i][1] = Integer.parseInt(line[1]);
		}

		Arrays.sort(meet, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		int time = 0, count = 0;
		for (int i = 0; i < meet.length; i++) {
			if (time <= meet[i][0]) {
				time = meet[i][1];
				count++;
			}
		}
		
		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();

	}
}
