package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CandidateKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] relation = { { "100", "ryan", "music", "2" }, { "200", "apeach", "math", "2" },
				{ "300", "tube", "computer", "3" }, { "400", "con", "computer", "4" }, { "500", "muzi", "music", "3" },
				{ "600", "apeach", "music", "2" } }; // 2

		int sol = sol(relation);

		System.out.println();
		System.out.println(sol);

	}

	static List<List<Integer>> list;

	private static int sol(String[][] relation) {

		boolean[] visited = new boolean[relation[0].length];
		for(int i = 1; i < relation[0].length /2 + 1; i++) {
			comb(relation[0], visited, 0, i);
		}
		
		for (List<Integer> data : set) {
			HashSet<String> strSet = new HashSet<String>();
			for(int i = 0; i < relation.length; i++) {
				for (Integer index : data) {
					strSet.add(relation[i][index]);
				}
			}
			System.out.println();
		}

		return 0;
	}
	static HashSet<List<Integer>> set = new HashSet<List<Integer>>();
	private static void comb(String[] data, boolean[] visited, int start, int count) {
		if(count == 0) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < visited.length; i++) {
				if(visited[i]) {
					list.add(i);
				}
			}
			set.add(list);
			
			return;
		}
		
		for(int i = start; i < data.length; i++) {
			visited[i] = true;
			comb(data, visited, start + 1, count -1);
			visited[i] = false;
		}
	}
	
}




















