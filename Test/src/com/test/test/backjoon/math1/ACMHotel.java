package com.test.test.backjoon.math1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			int height = sc.nextInt();
			int width = sc.nextInt();
			int number = sc.nextInt();

			int low = number % height;
			int deep = number / height + 1;
			if (low == 0) {
				low = 1;
				deep--;
			}
			
			list.add(low * 100 + deep);
//			System.out.println(low * 100 + deep);
		}
		
		System.out.println();
		for (Integer data : list) {
			System.out.println(data);
		}
	}

}
