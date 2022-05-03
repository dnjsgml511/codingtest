package com.test.test.backjoon.math1;

import java.util.Scanner;

public class SnailWantUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int roof = sc.nextInt();

		int clearday = (roof - down) / (up - down);

		if( (roof - down) % (up - down) != 0) {
			clearday++;
		}
		
		System.out.println(clearday);
	}

}
