package com.test.test.backjoon.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) {
		System.out.println("start!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < num; i++) {
			int[][] newpan = addQueen(new int[num][num], 0, i);
			dfs(newpan, 1);
		}

		System.out.println(answer);
	}

	static int answer;

	static void dfs(int[][] pan, int depth) {

		if (depth >= pan.length) {
			answer++;
			return;
		}

		for (int i = 0; i < pan.length; i++) {
			if (pan[depth][i] == 0) {
				dfs(addQueen(pan, depth, i), depth + 1);
			}
		}
	}

	static int[][] deepCopy(int[][] pan) {
		int[][] dest = new int[pan.length][pan.length];
		dest = pan.clone();
		return dest;
	}

	static int[][] addQueen(int[][] pan, int depth, int site) {
		if (pan == null) {
			return null;
		}
		if (pan[depth][site] == 2) {
			return null;
		}

		for (int i = 0; i < pan.length; i++) {
			pan[depth][i] = 2;
			pan[i][site] = 2;
		}
		pan[depth][site] = 1;

		for (int i = 1; i < pan.length - depth; i++) {
			if (site + i < pan.length) {
				pan[depth + i][site + i] = 2;
			}
			if (site - i >= 0) {
				pan[depth + i][site - i] = 2;
			}
		}

		return pan;
	}

	static void print(int[][] pan) {
		if (pan != null)
			for (int[] data : pan) {
				System.out.println(Arrays.toString(data));
			}
		System.out.println();
	}
}
