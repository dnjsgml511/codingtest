package com.test.test.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		int sol = sol(a, b);
		
		System.out.println(sol);
		
	}

	private static int sol(int a, String b) {
		return Arrays.stream(b.split("")).mapToInt(Integer::new).sum();
	}
	
}
