package com.test.test.backjoon.math2;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		sc.close();
		
		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);
	}

}
