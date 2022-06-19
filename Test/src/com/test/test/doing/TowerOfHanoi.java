package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TowerOfHanoi {

	static HashMap<Integer, List<Integer>> map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		map.put(1, list);
		map.put(2, new ArrayList<>());
		map.put(3, new ArrayList<>());
		
		bw.flush();
		bw.close();
	}

	static void move() {
		
	}

}
