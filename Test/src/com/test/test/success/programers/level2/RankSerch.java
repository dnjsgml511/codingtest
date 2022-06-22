package com.test.test.success.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class RankSerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

		int[] sol = sol(info, query);
		System.out.println(Arrays.toString(sol));
	}

	static HashMap<String, ArrayList<Integer>> scoreMap;
	static int score;
	static String[] strings;
	static String[] sInfoarr;

	static void dfs(int lv) {
		if (lv == 4) {
			String str = String.join("", strings);
			if (!scoreMap.containsKey(str)) {
				scoreMap.put(str, new ArrayList<Integer>());
			}
			scoreMap.get(str).add(score);
		} else {
			strings[lv] = sInfoarr[lv];
			dfs(lv + 1);
			strings[lv] = "-";
			dfs(lv + 1);
		}
	}

	static int lowerBound(ArrayList<Integer> list, int key) {
		
		
		int left = 0, right = list.size() - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if(list.get(mid) < key) 
				left = mid +1;
			else
				right = mid - 1;
		}
		return left;
	}

	private static int[] sol(String[] info, String[] query) {

		scoreMap = new HashMap<>();

		for (String sInfo : info) {
			strings = new String[4];
			sInfoarr = sInfo.split(" ");
			score = Integer.parseInt(sInfoarr[4]);
			dfs(0);
		}

		for (String key : scoreMap.keySet()) {
			Collections.sort(scoreMap.get(key));
		}

		int idx = 0;
		int[] answer = new int[query.length];
		for (String q : query) {
			String[] strs = q.split(" and | ");
			String key = strs[0] + strs[1] + strs[2] + strs[3];

			if (!scoreMap.containsKey(key))
				answer[idx++] = 0;
			else {
				ArrayList<Integer> ansList = scoreMap.get(key);
				answer[idx++] = ansList.size() - lowerBound(ansList, Integer.parseInt(strs[4]));
			}
		}

		return answer;
	}

//	private static int[] sol(String[] info, String[] query) {
//		
//		int[] scores = new int[info.length];
//		for (int i = 0; i < info.length; i++) {
//			int index = info[i].lastIndexOf(" ");
//			String score = info[i].substring(index + 1);
//			scores[i] = Integer.parseInt(score);
//			info[i] = info[i].substring(0, index).replaceAll(" ", "");
//		}
//		
//		int[] passscores = new int[query.length];
//		for (int i = 0; i < query.length; i++) {
//			int index = query[i].lastIndexOf(" ");
//			String score = query[i].substring(index + 1);
//			passscores[i] = Integer.parseInt(score);
//			query[i] = query[i].substring(0, index).replaceAll(" and ", "");
//			while (query[i].indexOf("--") != -1) {
//				query[i] = query[i].replaceAll("--", "-");
//			}
//			query[i] = query[i].replaceAll("-", ".*");
//		}
//		
//		int[] ret = new int[query.length];
//		for (int i = 0; i < info.length; i++) {
//			for (int j = 0; j < query.length; j++) {
//				if (scores[i] < passscores[j])
//					continue;
//				
//				if (info[i].matches("^" + query[j] + "$"))
//					ret[j]++;
//			}
//		}
//		
//		return ret;
//	}
}
