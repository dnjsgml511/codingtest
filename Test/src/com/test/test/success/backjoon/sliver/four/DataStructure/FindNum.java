package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FindNum {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bf.readLine();
		StringTokenizer st1 = new StringTokenizer(bf.readLine(), " ");
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		while (st1.hasMoreTokens()) {
			map.put(st1.nextToken(), true);
		}

		bf.readLine();
		StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
		while (st2.hasMoreTokens()) {
			if (map.getOrDefault(st2.nextToken(), false)) {
				bw.write(1);
			}else {
				bw.write(0);
			}
		}

		bw.flush();
		bw.close();
	}
}
