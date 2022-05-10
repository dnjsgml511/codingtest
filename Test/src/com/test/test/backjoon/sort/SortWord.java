package com.test.test.backjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		List<String> list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			list.add(sc.next());
		}
		
		list = list.stream().distinct().collect(Collectors.toList());

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() != s2.length()) {
					return s1.length() - s2.length();
				}
				return s1.compareTo(s2);
			}
		});
		
		for (String data : list) {
			System.out.println(data);
		}
		
	}
}
