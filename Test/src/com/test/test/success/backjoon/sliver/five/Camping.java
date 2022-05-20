package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Camping {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 1;
		while (true) {
			String line = br.readLine();
			if (line.equals("0 0 0")) {
				break;
			}

			String[] split = line.split(" ");
			int L = Integer.parseInt(split[0]);
			int P = Integer.parseInt(split[1]);
			int V = Integer.parseInt(split[2]);

			int all = V / P * L;
			int etc = V % P > L ? L : V % P;
			
			bw.write("Case " + count++ + ": " + (all + etc));
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}
