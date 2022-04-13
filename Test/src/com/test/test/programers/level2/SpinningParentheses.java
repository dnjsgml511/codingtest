package com.test.test.programers.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SpinningParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "[](){}";// 3
//		String s = "}]()[{";// 2
//		String s = "[)(]";// 0
//		String s = "}}}";// 0
		int sol = sol(s);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(String s) {

		String[] split = s.split("");
		List<Integer> list = new ArrayList<Integer>();

		int typeA = 0, typeB = 0, typeC = 0;

		for (String data : split) {
			int intdata = (int) data.charAt(0);
			list.add(intdata);
		}

		Integer first = list.get(0);
		int index = list.indexOf(first);
		System.out.println(index);
		

		return 0;
	}

}









