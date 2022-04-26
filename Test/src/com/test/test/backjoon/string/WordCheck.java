package com.test.test.backjoon.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCheck {

	private static boolean containword(String word1, String word2) {

		String longword = word1.length() > word2.length() ? word1 : word2;
		String shortword = word1.length() <= word2.length() ? word1 : word2;
		
		String[] split = shortword.split("");
		for (String data : split) {
			int index = longword.indexOf(data);
			if(index == -1) {
				return false;
			}
			System.out.println(data);
			longword = longword.substring(index + 1);
			System.out.println(longword);
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < loop; i++) {
			String word = sc.next();

			for (int j = 0; j < list.size(); j++) {
				containword(word, list.get(j));
			}

			list.add(word);
			System.out.println();
		}

	}

}
