package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PrinterQueue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			String[] line = br.readLine().split(" ");
			int findindex = Integer.parseInt(line[1]);
			String[] split = br.readLine().split(" ");

			Deque<int[]> que = new LinkedList<>();
			List<int[]> sort = new ArrayList<>();

			for (int j = 0; j < split.length; j++) {
				int[] inarr = new int[2];
				inarr[0] = Integer.parseInt(split[j]);
				inarr[1] = j;
				que.offerLast(inarr);
				sort.add(inarr);
			}

			Collections.sort(sort, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[0] - o1[0];
				}
			});

			int[] target = sort.remove(0);
			int count = 0;
			while (!que.isEmpty()) {
				int[] poll = que.pollFirst();
				if (poll[0] != target[0]) {
					que.offerLast(poll);
				} else {
					count++;
					if (poll[1] == findindex) {
						break;
					}
					target = sort.remove(0);
				}
			}
			bw.write(Integer.toString(count));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}

//3
//1 0
//5
//4 2
//1 2 3 4
//6 0
//1 1 9 1 1 1