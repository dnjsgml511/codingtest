package com.test.test.backjoon.recursive;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		loop = sc.nextInt();

		sc.close();

		arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;

		fibonac(0);
		
		System.out.println(arr[0]);
	}

	static int loop;
	static int[] arr;
	static void fibonac(int num) {
		
		if(num == loop)
			return;
		
		int num1 = arr[1];
		int num2 = arr[0] + arr[1];
		
		arr[0] = num1;
		arr[1] = num2;
		
		fibonac(++num);
	}
}
