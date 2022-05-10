package com.test.test.backjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nums = Integer.toString(sc.nextInt()).split("");

		sc.close();

		Arrays.sort(nums);

		StringBuilder sb = new StringBuilder();
		for (int i = nums.length-1; i >= 0; --i) {
			sb.append(nums[i]);
		}

		System.out.println(sb.toString());
	}

}
