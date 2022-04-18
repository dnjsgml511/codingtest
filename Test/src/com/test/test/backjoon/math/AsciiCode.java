package com.test.test.backjoon.math;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sol = sol(sc.next());
		
		System.out.println(sol);
		
	}

	private static int sol(String s) {
		return s.charAt(0);
	}
	
}
