package com.test.test.backjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Statistics {

	static List<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			list.add(sc.nextInt());
		}

		average();
		middle();
		many();
		range();
	}

	static void average() {
		double sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(Math.round(sum / list.size()));
	}

	static void middle() {
		Collections.sort(list);
		System.out.println(list.get(list.size() / 2));
	}

	static void many() {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer data : list) {
			map.put(data, map.getOrDefault(data, 0) + 1);
		}

		int max = 0;
		List<Integer> tmp = new ArrayList<Integer>();
		for (Entry<Integer, Integer> data : map.entrySet()) {
			if (max < data.getValue()) {
				max = data.getValue();
				tmp.clear();
				tmp.add(data.getKey());
			} else if (max == data.getValue()) {
				tmp.add(data.getKey());
			}
		}
		
		Collections.sort(tmp);
		
		if (tmp.size() >= 2) {
			System.out.println(tmp.get(1));
		} else {
			System.out.println(tmp.get(0));
		}
	}

	static void range() {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int data : list) {
			max = Math.max(max, data);
			min = Math.min(min, data);
		}
		
		System.out.println(max - min);
	}

}

