package com.test.test.backjoon.math2;

import java.util.Scanner;

public class OutSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int w = sc.nextInt();
		int h = sc.nextInt();

		System.out.println(Math.min(Math.min(Math.abs(w - x), x), Math.min(Math.abs(h - y), y)));
	}

}
