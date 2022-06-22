package com.test.test.success.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximizeFormulas {

	public static void main(String[] args) {

		String expression = "100-200*300-500+20"; // 60420
//		String expression = "50*6-3*2"; // 300

		long sol = sol(expression);

		System.out.println();
		System.out.println(sol);

	}

	static long sol(String expression) {

		long answer = 0;
		boolean[] visited = new boolean[3];
		String[] operationTypes = { "-", "-", "*" };

		permutation(new ArrayList<>(), operationTypes, visited);
		
		List<Long> numbers = Arrays.stream(expression.replaceAll("-|\\*|\\+", " ").split(" "))
				.map(Long::parseLong).collect(Collectors.toList());
		
		List<String> collect = Arrays.stream(expression.replaceAll("[0-9]", "").split(" "))
				.collect(Collectors.toList());
		
		for(List<String> strings : list) {
//			answer = Math.max(answer, sol(strings, numbers, collect));
		}
		
		return 0;
	}

	static List<List<String>> list = new ArrayList<>();

	static void permutation(ArrayList<String> arrayList, String[] orders, boolean[] visited) {
		if (arrayList.size() == 3) {
			list.add(arrayList);
			return;
		}
		for (int i = 0; i < orders.length; i++) {
			if (!visited[i]) {
				ArrayList<String> temp = new ArrayList<>(arrayList);
				temp.add(orders[i]);
				visited[i] = true;
				permutation(temp, orders, visited);
				visited[i] = false;
			}
		}
	}

//	static long sol2(String expression) {
//
//		String formREG = "[+\\\\-*/]";
//
//		list = new ArrayList<String>();
//		String[] formulas = expression.replaceAll("[0-9]", "").split("");
//		String[] distinctFormulas = Arrays.stream(formulas).distinct().toArray(String[]::new);
//		String[] nums = expression.split("[+\\-*/]");
//
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < distinctFormulas.length; i++)
//			sb.append(distinctFormulas[i]);
//
//		permutation(sb.toString(), "");
//
//		for (int i = 0; i < list.size(); i++) {
//			for (String string : list.get(i).split("")) {
//
//				System.out.println(expression);
//
//				int cutline = expression.indexOf(string);
//				String front = expression.substring(0, cutline);
//				String back = expression.substring(cutline + 1);
//				String mark = expression.substring(cutline, cutline + 1);
//
//				String[] frontSplit = front.split("[+\\-*/]");
//				String firstnum = frontSplit[frontSplit.length - 1];
//				String secondnum = back.split("[+\\-*/]")[0];
//
//				int intfirstnum = Integer.parseInt(firstnum);
//				int intsecondnum = Integer.parseInt(secondnum);
//
//				int num = 0;
//				switch (mark) {
//				case "+":
//					num = intfirstnum + intsecondnum;
//					break;
//				case "-":
//					num = intfirstnum - intsecondnum;
//					break;
//				case "*":
//					num = intfirstnum * intsecondnum;
//					break;
//				case "/":
//					num = intfirstnum / intsecondnum;
//					break;
//				default:
//					break;
//				}
//
//				String strnum = Integer.toString(num);
//
//				String frontETC = front.length() == firstnum.length() ? "" : front.substring(0, firstnum.length());
//				String backETC = back.length() == secondnum.length() ? "" : back.substring(secondnum.length());
//
//				expression = frontETC + strnum + backETC;
//
//			}
//			System.out.println();
//		}
//
//		return 0;
//	}
//
////	static List<String> list;
//
//	static void permutation(String str, String prefix) {
//		if (str.length() == 0) {
//			list.add(prefix);
//		} else {
//			for (int i = 0; i < str.length(); i++) {
//				String tmp = str.substring(0, i) + str.substring(i + 1);
//				permutation(tmp, prefix + str.split("")[i]);
//			}
//		}
//	}

}
