package com.test.test.backjoon.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num = sc.next();
		sc.close();

		String[] arr = num.split("");

//		int n = arr.length;
//		int r = arr.length;
//
//		LinkedList<String> perArr = new LinkedList<>();
//		perm(n, r, perArr, arr);
//
//		System.out.println(max);
	}

//	static int max = -1;

//	static void perm(int n, int r, LinkedList<String> perArr, String[] arr) {
//		if (perArr.size() == r) {
//			StringBuilder sb = new StringBuilder();
//			for (String str : perArr) {
//				sb.append(str);
//			}
//
//			int num = Integer.parseInt(sb.toString());
//			if (num % 30 == 0) {
//				max = Math.max(max, num);
//			}
//
//			return;
//		}
//
//		for (int i = 0; i < n; i++) {
//			perArr.add(arr[i]);
//			perm(n, r, perArr, arr);
//			perArr.removeLast();
//		}
//	}

}
