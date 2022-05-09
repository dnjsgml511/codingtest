package com.test.test.backjoon.math1;

import java.math.BigInteger;
import java.util.Scanner;

public class BignumPlus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(new BigInteger(sc.next()).add(new BigInteger(sc.next())).toString());
		
	}
}

// 9223372036854775807 9223372036854775808