package com.test.test.programers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LottoRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] lottos = { 44, 1, 0, 0, 31, 25 };
//		int[] win_nums = { 31, 10, 45, 1, 6, 19 }; // [3, 5]
//		int[] lottos = { 0, 0, 0, 0, 0, 0 };
//		int[] win_nums = { 38, 19, 20, 40, 15, 25 }; // [1, 6]
//		int[] lottos = { 45, 4, 35, 20, 3, 9 };
//		int[] win_nums = { 20, 9, 3, 45, 4, 35 }; // [1, 1]
		int[] lottos = { 1, 2, 3, 4, 5, 6 };
		int[] win_nums = { 7, 8, 9, 10, 11, 12 }; // [1, 1]

		int[] sol = sol(lottos, win_nums);

		System.out.println();
		System.out.println(Arrays.toString(sol));
	}

	private static int[] sol(int[] lottos, int[] win_nums) {

		List<Integer> lottoList = Arrays.stream(lottos).boxed().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

		int min = 0;
		int max = 0;
		for (Integer data : lottoList) {
			if (data == 0) {
				max++;
			}
			if (winList.indexOf(data) != -1) {
				min++;
			}
		}

		int[] answer = {  Math.min(7 - (min + max), 6)  , Math.min(7 - min, 6) };

		return answer;
	}

}




