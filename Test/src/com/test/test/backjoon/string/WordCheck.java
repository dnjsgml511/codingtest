package com.test.test.backjoon.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCheck {

	private static boolean check(String checkword, String newword) {

		if (checkword.equals(newword))
			return true;

		String longword = checkword.length() > newword.length() ? checkword : newword;
		String shortword = checkword.length() <= newword.length() ? checkword : newword;

		String[] split = shortword.split("");

		for (String data : split) {
			int index = longword.indexOf(data);
			if (index == -1) {
				return false;
			}
			longword = longword.substring(index + 1);
		}

		return true;
	}

	private static List<String> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			String word = sc.next();

			for (int j = 0; j < list.size(); j++) {
				boolean check = check(list.get(j), word);
				if (!check)
					break;
			}

			list.add(word);
		}

	}

}
