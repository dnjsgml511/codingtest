package com.test.test.backjoon.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NQueen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();

		st = new Stack<>();
		arr = new int[num];
		list = new ArrayList<>();
		answer = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}
		check = new boolean[num];
		permutation(num, num);
		
		System.out.println(list);
	}

	static int num, answer;
	static int[] arr;
	static boolean[] check;
	static Stack<Integer> st;
	static List<Stack<Integer>> list;

	static void permutation(int n, int r) {

		if (st.size() == r) {
			Stack<Integer> newst = new Stack<>();
			for(int i = 0; i < st.size(); i++) {
				newst.add(st.get(i));
			}
			list.add(newst);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				check[i] = true;
				st.push(arr[i]);
				permutation(n, r);
				st.pop();
				check[i] = false;
			}
		}
	}
}
