package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class DFSandBFS {

	static HashMap<String, PriorityQueue<String>> map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int spot = Integer.parseInt(st.nextToken());
		int load = Integer.parseInt(st.nextToken());
		String start = st.nextToken();

		System.out.println();
		System.out.println();

		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < load; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String node1 = st.nextToken();
			String node2 = st.nextToken();

			List<String> tmp = map.getOrDefault(node1, new ArrayList<>());
			tmp.add(node2);
			map.put(node1, tmp);
			tmp = map.getOrDefault(node2, new ArrayList<>());
			tmp.add(node1);
			map.put(node2, tmp);
		}
		
		dfs(map, start);

		bw.flush();
		bw.close();
	}

	static void dfs(HashMap<String, List<String>> map, String target) {
		List<String> pop = map.get(target);
		
	}
}

//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4
