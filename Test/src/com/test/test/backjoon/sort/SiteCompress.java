package com.test.test.backjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SiteCompress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Integer> rank = new ArrayList<>();
		List<Integer> distinct = new ArrayList<>();

		for (int i = 0; i < loop; i++) {
			int num = sc.nextInt();
			list.add(num);
			distinct.add(num);
		}
		sc.close();

		distinct = distinct.stream().distinct().collect(Collectors.toList());
		Collections.sort(distinct);
		
		System.out.println(distinct);
		
	}
}

/**
5 2 4 -10 4 -9
 */