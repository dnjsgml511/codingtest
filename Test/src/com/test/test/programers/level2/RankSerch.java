package com.test.test.programers.level2;

import java.util.Arrays;

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

	private static int[] sol(String[] info, String[] query) {

		String[][] users = new String[info.length][5];
		for (int i = 0; i < info.length; i++) {
			users[i] = info[i].split(" ");
		}

		String[][] wants = new String[query.length][5];
		for (int i = 0; i < query.length; i++) {
			wants[i] = query[i].split(" and ");
		}

		int[] answer = new int[query.length];
		int index = 0;
		for (String[] user : users) {
			int count = 0;
			for (String[] want : wants) {
				boolean lang = user[0].equals(want[0]);
				boolean position = user[1].equals(want[1]);
				boolean grade = user[2].equals(want[2]);
				boolean food = user[3].equals(want[3]);
				boolean score = Integer.parseInt(user[4]) >= Integer.parseInt(want[4]);

				if (lang && position && grade && food && score)
					count++;
			}
			answer[index] = count;
			index++;
		}

		System.out.println(Arrays.toString(answer));

		return null;
	}

}
