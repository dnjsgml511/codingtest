package com.test.test.programers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestElbum {
	public static void main(String[] args) {

		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 }; // [4, 1, 3, 0]

		int[] sol = sol(genres, plays);

		System.out.println();
		System.out.println(Arrays.toString(sol));

	}

	private static int[] sol(String[] genres, int[] plays) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < genres.length; i++) {
			int num = map.getOrDefault(genres[i], 0) + plays[i];
			map.put(genres[i], num);
		}

		List<Vo> list = new ArrayList<Vo>();
		for (int i = 0; i < genres.length; i++) {
			list.add(new Vo(genres[i], plays[i], i, map.getOrDefault(genres[i], 0)));
		}
		Collections.sort(list, (a, b) -> {
			return b.sum - a.sum;
		});

		Collections.sort(list, (a, b) -> {
			return a.sum == b.sum ? b.play - a.play : 0;
		});

		String tmp = "";
		boolean flag = true;
		List<Integer> indexs = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (!tmp.equals(list.get(i).genre)) {
				indexs.add(list.get(i).index);
				flag = true;
			} else if (flag) {
				flag = false;
				indexs.add(list.get(i).index);
			} 
			tmp = list.get(i).genre;
		}

		return indexs.stream().mapToInt(i->i).toArray();
	}

	public static class Vo {
		String genre;
		int play;
		int index;
		int sum;

		public Vo(String genre, int play, int index, int sum) {
			this.genre = genre;
			this.play = play;
			this.index = index;
			this.sum = sum;
		}
	}

}
