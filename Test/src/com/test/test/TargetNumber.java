package com.test.test;

public class TargetNumber {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		int sol = sol(numbers, target);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(int[] numbers, int target) {

		dfs(numbers, 0, target, 0);
		return answer;
	}

	private static int answer = 0;

	private static void dfs(int[] numbers, int depth, int target, int sum) {
		if (depth == numbers.length) {
			if (target == sum)
				answer++;
		} else {
			dfs(numbers, depth + 1, target, sum + numbers[depth]);
			dfs(numbers, depth + 1, target, sum - numbers[depth]);
		}
	}

}
