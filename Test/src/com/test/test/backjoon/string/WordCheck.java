package com.test.test.backjoon.string;

import java.util.HashSet;
import java.util.Scanner;

public class WordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		int answer = loop;
		
		for (int i = 0; i < loop; i++) {
			String[] words = sc.next().split("");

			HashSet<String> set = new HashSet<>();
			String before = "";
			for (int j = 0; j < words.length; j++) {
				if(!before.equals(words[j])) {
					before = words[j];
					boolean check = set.add(before);
					if(!check) {
						answer--;
						break;
					}
				}
			}
		}
		
		System.out.println(answer);
	}

}
