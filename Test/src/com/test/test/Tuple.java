package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"; // [2, 1, 3, 4]
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}"; // [2, 1, 3, 4]
//		String s = "{{20,111},{111}}";// [111, 20]
//		String s = "{{123}}";// [123]
//		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";// [3,2,4,1]
		int[] sol = sol(s);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	private static int[] sol(String s) {

		String[] split = s.split("\\},\\{");
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < split.length; i++) {
			String target = split[i].replaceAll("\\{", "").replaceAll("\\}", "");
			String[] cut = target.split(",");

			List<Integer> tmp = new ArrayList<Integer>();
			for (String data : cut) {
				tmp.add(Integer.parseInt(data));
			}

			list.add(tmp);
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).size() > list.get(j).size()) {
					List<Integer> tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}

		List<Integer> removelist = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			List<Integer> tmp = list.get(i);

			tmp.removeAll(removelist);
			int target = tmp.get(0);
			removelist.add(target);
		}
		
		int[] answer = new int[removelist.size()];
		for (int i = 0; i < removelist.size(); i++) {
			answer[i] = removelist.get(i);
		}

		return answer;
	}

}
