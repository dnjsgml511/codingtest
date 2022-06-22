package com.test.test.success.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MenuRenewal {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = { 2, 3, 4 };
//		String[] result = { "AC", "ACDE", "BCFG", "CDE" };

		String[] sol = sol(orders, course);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	static HashMap<String, Integer> map;

	static void comb(String str, StringBuilder sb, int idx, int cnt, int n) {
		if (cnt == n) {
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
			return;
		}
		for (int i = idx; i < str.length(); i++) {
			sb.append(str.charAt(i));
			comb(str, sb, i + 1, cnt + 1, n);
			sb.delete(cnt, cnt + 1);
		}
	}

	static String[] sol(String[] orders, int[] course) {

		ArrayList<String> answer = new ArrayList<>();
		
		System.out.println(Arrays.toString(orders));
		System.out.println(Arrays.toString(course));
		System.out.println();
		
		for (int i = 0; i < orders.length; i++) {
			char[] charArr = orders[i].toCharArray();
			Arrays.sort(charArr);
			orders[i] = String.valueOf(charArr);
		}

		for (int i = 0; i < course.length; i++) {
			map = new HashMap<>();
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < orders.length; j++) {
				StringBuilder sb = new StringBuilder();
				if (course[i] <= orders[j].length()) {
					comb(orders[j], sb, 0, 0, course[i]);
				}
			}
			for(Entry<String, Integer> entry : map.entrySet()) {
				max = Math.max(max, entry.getValue());
			}
			
			for(Entry<String, Integer> entry : map.entrySet()) {
				if(max >= 2 && entry.getValue() == max) {
					answer.add(entry.getKey());
				}
			}
		}
		
		Collections.sort(answer);

		System.out.println(answer);
		
		return null;
	}

	static String[] sol2(String[] orders, int[] course) {

		List<String> list = new ArrayList<String>();
		for (String data : orders) {
			for (String indata : data.split("")) {
				if (!list.contains(indata)) {
					list.add(indata);
				}
			}
		}
		Collections.sort(list);

		result = new ArrayList<String>();

		int len = list.size();
		boolean[] visited = new boolean[len];
		for (int i = 2; i < len; i++) {
			dfs(list, visited, 0, i);
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String reg : result) {
			for (String data : orders) {
				if (data.matches(reg)) {
					int count = map.getOrDefault(reg, 0) + 1;
					map.put(reg, count);
				}
			}
		}

		for (Entry<String, Integer> data : map.entrySet()) {
			if (data.getValue() < 2) {
				boolean check = result.remove(data.getKey());
			}
		}

		for (int i = 0; i < result.size(); i++) {
			String reg = result.get(i);
			for (int j = i + 1; j < result.size(); j++) {
			}
		}

		return null;
	}

	static List<String> result;

	static void dfs(List<String> arr, boolean[] visited, int start, int r) {

		if (r == 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(".*");
			for (int i = 0; i < visited.length; i++) {
				if (visited[i]) {
					sb.append(arr.get(i)).append(".*");
				}
			}
			result.add(sb.toString());

		} else {
			for (int i = start; i < arr.size(); i++) {
				visited[i] = true;
				dfs(arr, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}

	}
}

//String[] orders = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
//int[] course = { 2, 3, 5 };
//String[] result = { "ACD", "AD", "ADE", "CD", "XYZ" };

//String[] orders = { "XYZ", "XWY", "WXA" };
//int[] course = { 2, 3, 4 };
//String[] result = { "WX", "XY" };