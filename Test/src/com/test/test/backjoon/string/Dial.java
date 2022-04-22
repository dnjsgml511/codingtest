package com.test.test.backjoon.string;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] texts = sc.next().toUpperCase().split("");
		
		int sum = 0;
		for (String data : texts) {
			int num = (data.charAt(0) - 65) / 3 + 3;
			num = num == 11 ? 10 : num;
			sum+= num;
		}
		
		System.out.println(sum);
	}

}
