package com.test.test.backjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class LoosingBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sik = sc.next();

		sc.close();

		String[] num = sik.split("[+-]");
		if (sik.charAt(0) != '-') {
			sik = "+" + sik;
		}
		String[] pm = sik.split("[0-9]");

		pm = Arrays.stream(pm).filter(i -> !i.equals("")).toArray(String[]::new);

		for (int i = 0; i < pm.length - 1; i++) {
			if (pm[i].equals("-")) {
				for (int j = i + 1; j < pm.length; j++) {
					if (!pm[j].equals("-")) {
						pm[j] = "-";
					}
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < pm.length; i++) {
			if (pm[i].equals("+")) {
				sum += Integer.parseInt(num[i]);
			} else {
				sum -= Integer.parseInt(num[i]);
			}
		}

		System.out.println(sum);
	}
}

/**
 * 10+20+30+40
 */