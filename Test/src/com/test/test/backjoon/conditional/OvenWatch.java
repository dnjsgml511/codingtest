package com.test.test.backjoon.conditional;

import java.util.Scanner;

public class OvenWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();

		minute += time;

		if (minute >= 60) {
			hour += (minute / 60);
			minute = minute % 60;
		}

		if (hour >= 24) {
			hour -= 24;
		}

		System.out.println(hour + " " + minute);
	}
}
