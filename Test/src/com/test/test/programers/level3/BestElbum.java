package com.test.test.programers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
			int count = map.getOrDefault(genres[i], 0) + plays[i];
			map.put(genres[i], count);
		}

		List<String> list = Arrays.stream(genres).distinct().collect(Collectors.toList());

		Collections.sort(list, (a, b) -> {
			return map.get(a) - map.get(b);
		});

		List<Vo> voList = new ArrayList<Vo>();
		for (int i = 0; i < genres.length; i++) {
			voList.add(new Vo(genres[i], plays[i], i));
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < voList.size(); j++) {
				if (voList.get(j).genre.equals(list.get(i))) {
					Vo vo = voList.remove(j);
					voList.add(0, vo);
				}
			}
		}

		Collections.sort(voList, (a, b) -> {
			return a.genre.equals(b.genre) ? b.play - a.play : 0;
		});

		List<Integer> intList = new ArrayList<Integer>();
		int start = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			String tmp = list.get(i);
			for (int j = start; j < voList.size() - 1; j++) {
				if (voList.get(j).genre.equals(tmp)) {
					intList.add(voList.get(j).index);
				} else {
					start = j;
					break;
				}
			}
		}

		return intList.stream().mapToInt(i->i).toArray();
	}

	private static class Vo {
		String genre;
		int play;
		int index;

		public Vo() {
		}

		public Vo(String genre, int play, int index) {
			this.genre = genre;
			this.play = play;
			this.index = index;
		}

		@Override
		public String toString() {
			return "vo [genre=" + genre + ", play=" + play + ", index=" + index + "]";
		}
	}
}
