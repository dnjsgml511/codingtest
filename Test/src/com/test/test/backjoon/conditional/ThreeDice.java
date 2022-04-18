package com.test.test.backjoon.conditional;

import java.util.HashSet;
import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(dice1);
		boolean check2 = set.add(dice2);
		boolean check3 = set.add(dice3);

		if (check2 && check3) {
			System.out.println(Math.max(dice1, Math.max(dice2, dice3)) * 100);
			return;
		}

		if (!check2 && !check3) {
			System.out.println(10000 + dice1 * 1000);
			return;
		}

		if (!check2) {
			System.out.println(1000 + dice1 * 100);
			return;
		}
		

		if (!check3) {
			System.out.println(1000 + dice3 * 100);
			return;
		}
	}
}
