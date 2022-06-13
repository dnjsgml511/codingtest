package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RightBigNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			int target = list.get(i);

			List<Integer> tmp = list.subList(i + 1, list.size());
			if (tmp.size() == 1) {
				bw.write(Integer.toString(tmp.get(0)));
				bw.write(" ");
			} else if (tmp.size() == 0) {
				bw.write("-1 ");
			} else {
				int first = tmp.get(0);
				int second = tmp.get(1);
				int depth = second - first;

				for (int j = 1; j < tmp.size(); j++) {
					int num = tmp.get(j);
					if (num != first + depth) {
						bw.write(Integer.toString(first + depth));
						bw.write(" ");
					}
				}
			}
		}

		bw.flush();
		bw.close();
	}
}

//7
//4 3 2 1 2 3 4

//10
//1 3 6 9 12 2 5 10 15 20

//4
//3 5 2 7
