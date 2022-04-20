package com.test.test.backjoon.function;

import java.util.HashSet;

public class SelfProgression {

	public static void main(String[] args) throws Exception {

		int count = 10000;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 1; i <= count; i++) {
			String[] nums = Integer.toString(i).split("");
			int sum = i;
			for (String data : nums) {
				sum += Integer.parseInt(data);
			}
			if(sum <= count) {
				set.add(sum);
			}
		}
		
		for (int i = 1; i <= count; i++) {
			if(set.add(i)) {
				System.out.println(i);
			}
		}
		
	}
}
