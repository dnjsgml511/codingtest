package com.test.test.backjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class SumLastZero {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int first = -1, second = -1;
		List<Integer> list = new ArrayList<Integer>();
		while (first != 0 && second != 0) {
			String[] line = bf.readLine().split(" ");
			first = Integer.parseInt(line[0]);
			second = Integer.parseInt(line[1]);
			list.add(first + second);
		}

		for (int i = 0; i < list.size()-1; i++) {
			bw.write(list.get(i) + "\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}
