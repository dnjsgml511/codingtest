package com.test.test.backjoon.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindMostAlpabat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] texts = sc.next().toUpperCase().split("");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String text : texts) {
			int count = map.getOrDefault(text, 0) + 1;
			map.put(text, count);
		}

		int max = 0;
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			max = Math.max(max, entrySet.getValue());
		}

		List<String> maxs = new ArrayList<String>();
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == max) {
				maxs.add(entrySet.getKey());
			}
		}
		
		if(maxs.size() != 1) {
			System.out.println("?");
		}else {
			System.out.println(maxs.get(0));
		}

	}

}
