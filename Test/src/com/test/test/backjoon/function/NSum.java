package com.test.test.backjoon.function;

import java.util.Scanner;

public class NSum {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int[] a = {1,2,3};
		
		Test test = new Test();
		long sum = test.sum(a);
		
		System.out.println(sum);
		
	}

}

class Test {
	public static long sum(int[] a) {
		long ans = 0;
		for(int data : a) {
			ans += data;
		}
		return ans;
	}
}
