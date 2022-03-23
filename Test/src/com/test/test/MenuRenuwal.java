package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MenuRenuwal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] corse = { 2, 3, 4 }; // "AC", "ACDE", "BCFG", "CDE"
//		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}; int[] corse = {2,3,5}; // "ACD", "AD", "ADE", "CD", "XYZ"
//		String[] orders = {"XYZ", "XWY", "WXA"}; int[] corse = {2,3,4}; // "WX", "XY"
		String[] sol = sol(orders, corse);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	static List<String> list;

	private static String[] sol(String[] orders, int[] course) {

		list = new ArrayList<String>();

		Set<Integer> chars = new HashSet<Integer>();
		for (String data : orders) {
			Set<Integer> set = data.chars().boxed().collect(Collectors.toSet());
			chars.addAll(set);
		}

		Integer[] data = chars.toArray(new Integer[0]);
		boolean[] visited = new boolean[chars.size()];
		List<Integer> courseList = Arrays.stream(course).boxed().collect(Collectors.toList());

		for (int i = 1; i < data.length; i++) {
			comb(data, visited, 0, i, courseList);
		}

		System.out.println(list);

		return null;
	}

	private static void comb(Integer[] data, boolean[] visited, int start, int count, List<Integer> course) {

		if (count == 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < data.length; i++) {
				if (visited[i]) {
					sb.append((char) (int) data[i]);
				}
			}
			int len = sb.length();
			if (course.indexOf(len) != -1 && list.indexOf(sb.toString()) == -1) {
				list.add(sb.toString());
			}

			return;
		}

		for (int i = start; i < data.length; i++) {
			visited[i] = true;
			comb(data, visited, start + 1, count - 1, course);
			visited[i] = false;
		}

	}

}
