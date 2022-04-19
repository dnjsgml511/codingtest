package com.test.test.backjoon.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MathAverage {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < count; i++) {
			Double num = (double) sc.nextInt();
			list.add(num);
		}
		
		Double max = Collections.max(list);

		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			double num = list.get(i) / max * 100;
			sum += num;
		}

		System.out.println(sum / count);
	}
}
