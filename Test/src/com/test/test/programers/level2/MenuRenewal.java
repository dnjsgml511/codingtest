package com.test.test.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MenuRenewal {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };
//		String[] result = { "AC", "ACDE", "BCFG", "CDE" };

//		String[] orders = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
//		int[] course = { 2, 3, 5 };
//		String[] result = { "ACD", "AD", "ADE", "CD", "XYZ" };

//		String[] orders = { "XYZ", "XWY", "WXA" };
//		int[] course = { 2, 3, 4 };
//		String[] result = { "WX", "XY" };

		String[] sol = sol(orders, course);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	static List<String> strings;

	static String[] sol(String[] orders, int[] course) {

		strings = new ArrayList<String>();

		List<String> list = new ArrayList<String>();
		for (String order : orders) {
			String[] split = order.split("");
			for (String string : split) {
				if (list.indexOf(string) == -1) {
					list.add(string);
				}
			}
		}

		boolean[] visited = new boolean[list.size()];

		for (int c : course) {
			dfs(list, visited, 0, c);
		}

		for(int i = 0; i < strings.size(); i++) {
			
		}
		
		return null;
	}

	static void dfs(List<String> list, boolean[] visited, int start, int r) {
		if (r == 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(".*");
			for (int i = 0; i < visited.length; i++) {
				if (visited[i]) {
					sb.append(list.get(i)).append(".*");
				}
			}
			strings.add(sb.toString());
		} else {
			for (int i = start; i < list.size(); i++) {
				visited[i] = true;
				dfs(list, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
	}

}
