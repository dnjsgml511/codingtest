package com.test.test.doing;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class ATowerBlock {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		builds = new int[N];
		for (int i = 0; i < N; i++) {
			builds[i] = Integer.parseInt(line[i]);
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, check(i));
			System.out.println();
		}

		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();
	}

	static int[] builds;
	static int N;

	static int check(int idx) {
		Point target = new Point(idx, builds[idx]);

		int count = 0;
		BigDecimal min = new BigDecimal(Double.MIN_VALUE);
		for (int i = idx - 1; i >= 0; --i) {
			Point after = new Point(i, builds[i]);
			BigDecimal x = new BigDecimal(after.x - target.x);
			BigDecimal y = new BigDecimal(after.y - target.y);
			
			System.out.println(x + " / " + y);
			
			BigDecimal slope = x.divide(y);
			if (slope.compareTo(min) <= 0) {
				count++;
				min = slope;
			}
		}

		min = new BigDecimal(Double.MIN_VALUE);
		for (int i = idx + 1; i < N; i++) {
			Point after = new Point(i, builds[i]);
			BigDecimal x = new BigDecimal(target.x - after.x);
			BigDecimal y = new BigDecimal(target.y - after.y);
			BigDecimal slope = x.divide(y);

			if (slope.compareTo(min) <= 0) {
				count++;
				min = slope;
			}
		}

		return count;
	}
}

//10
//1000000000 999999999 999999998 999999997 999999996 1 2 3 4 5