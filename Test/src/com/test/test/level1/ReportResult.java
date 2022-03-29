package com.test.test.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReportResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] id_list = { "con", "ryan" };
		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" };
		int k = 3; // [0,0]
//		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
//		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
//		int k = 2; // [2,1,1,0]

		int[] sol = sol(id_list, report, k);
		System.out.println();
		System.out.println(Arrays.toString(sol));
	}

	private static int[] sol(String[] id_list, String[] report, int k) {

		int[] answer = new int[id_list.length];
		List<String> userlist = Arrays.asList(id_list);
		List<String> reportlist = Arrays.asList(report);
		reportlist = reportlist.stream().distinct().collect(Collectors.toList());
		HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();

		for (String data : report) {
			String id = data.split(" ")[0];
			String blackuser = data.split(" ")[1];
			Set<String> list = map.getOrDefault(blackuser, new HashSet<String>());
			list.add(id);

			map.put(blackuser, list);
		}
		
		for (String id : id_list) {
			Set<String> list = map.getOrDefault(id, new HashSet<String>());
			if (list.size() >= k) {
				for (String data : list) {
					int index = userlist.indexOf(data);
					answer[index]++;
				}
			}
		}

		return answer;
	}

}
