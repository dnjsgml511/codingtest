package com.test.test.backjoon.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		int max = sc.nextInt();

		int[] cards = new int[loop];
		for (int i = 0; i < loop; i++) {
			cards[i] = sc.nextInt();
		}
		
		sc.close();

		dfs(cards, max);
		
		List<Integer> sums = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int sum = list.get(i).stream().mapToInt(Integer::intValue).sum();
			if(sum <= max) {
				sums.add(sum);
			}
		}
		
		System.out.println(sums.stream().mapToInt(Integer::intValue).max().getAsInt());
		
	}

	static List<List<Integer>> list;

	static void dfs(int[] arr, int max) {
		list = new ArrayList<>();
		int len = arr.length;
		boolean[] visited = new boolean[len];

		dfs(arr, visited, 0, 3);
	}

	static void dfs(int[] arr, boolean[] visited, int start, int r) {

		if (r == 0) {
			List<Integer> inlist = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) {
					inlist.add(arr[i]);
				}
			}
			list.add(inlist);
		} else {
			for (int i = start; i < arr.length; i++) {
				visited[i] = true;
				dfs(arr, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
		
	}
}

/**
 * 5 21 5 6 7 8 9
 */