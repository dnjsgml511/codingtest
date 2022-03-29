package com.test.test.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReportUser {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" }; // 2, 1, 1, 0
//		String[] id_list = { "con", "ryan" };
//		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con" }; // 0,0
		int k = 2;

		int[] sol = sol(id_list, report, k);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	private static int[] sol(String[] id_list, String[] report, int k) {

		int[] answer = new int[id_list.length];
		HashMap<String, List<String>> sendMail = new HashMap<String, List<String>>();
		HashMap<String, Integer> stack = new HashMap<String, Integer>();

		for (String data : id_list) {
			sendMail.put(data, new ArrayList<String>());
			stack.put(data, 0);
		}

		for (String data : report) {
			String[] split = data.split(" ");
			String caller = split[0], baduser = split[1];
			
			List<String> list = sendMail.get(caller);
			if(list.indexOf(baduser) == -1) {
				stack.put(baduser, stack.get(baduser) + 1);

				list.add(baduser);
				sendMail.put(caller, list);
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			List<String> list = sendMail.get(id_list[i]);
			for(int j = 0; j < list.size(); j++) {
				if(stack.get(list.get(j)) >= k) {
					answer[i] += 1;
				}
			}
		}

		return answer;
	}
}
