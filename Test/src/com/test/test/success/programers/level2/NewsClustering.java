package com.test.test.success.programers.level2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {

	public static void main(String[] args) {

		String[] str1 = { "FRANCE", "handshake", "aa1+aa2", "E=M*C^2" };
		String[] str2 = { "french", "shake hands", "AAAA12", "e=m*c^2" };
		int[] answer = { 16384, 65536, 43690, 65536 };

		for (int i = 0; i < str1.length; i++) {

			int sol = solution(str1[i], str2[i]);

			if (answer[i] != sol) {
				System.out.println("Fail");
				return;
			} else {
				System.out.println("Go");
			}
		}
		System.out.println("Success");
	}

	static int solution(String str1, String str2) {

		int num = 65536;

		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		String[] word1 = twoword(str1);
		String[] word2 = twoword(str2);

		int filter = filter(word1, word2);
		int all = all(word1, word2) - filter;

		if(all == 0) {
			return num; 
		}
		
		return filter * num / all;
	}

	static String[] twoword(String str) {

		List<String> list = new ArrayList<String>();

		char A = "A".charAt(0);
		char Z = "Z".charAt(0);

		for (int i = 0; i < str.length() - 1; i++) {
			char first = str.charAt(i);
			char second = str.charAt(i + 1);

			if (A > first || first > Z)
				continue;
			if (A > second || second > Z)
				continue;

			list.add( new StringBuilder().append(first).append(second).toString());
		}
		
		String[] ret = new String[list.size()];
		for(int i = 0; i < list.size(); i++)
			ret[i] = list.get(i);

		return ret;
	}

	static int all(String[] str1, String[] str2) {
		return str1.length + str2.length;
	}

	static int filter(String[] str1, String[] str2) {

		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < str1.length; i++)
			list1.add(str1[i]);
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < str2.length; i++)
			list2.add(str2[i]);

		int count = 0;
		for (int i = 0; i < str1.length; i++)
			if (list2.remove(list1.remove(0)))
				count++;

		return count;
	}
}
