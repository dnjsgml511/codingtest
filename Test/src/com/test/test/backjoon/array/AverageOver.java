package com.test.test.backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOver {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			double count = sc.nextInt(), sum = 0;
			List<Integer> students = new ArrayList<Integer>();
			for (int j = 0; j < count; j++) {
				int score = sc.nextInt();
				students.add(score);
				sum += score;
			}
			double average = sum / count;

			double over = students.stream().filter(c -> c > average).count() / count;
			double percent = Math.round(over * 100000.0) / 1000.0;
			
			System.out.println(String.format("%.3f", percent) + "%");
		}
	}
}
