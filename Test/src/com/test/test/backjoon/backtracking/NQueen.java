package com.test.test.backjoon.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueen {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		backtracking(new int[num][num], 0);

		System.out.println(answer);
	}

	static int answer;

	static void backtracking(int[][] board, int depth) {
		if (depth >= board.length) {
			answer++;
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[depth][i] == 0) {
				int[][] dest = deepCopy(board);
				backtracking(addQueen(dest, depth, i), depth + 1);
			}
		}
	}

	static int[][] deepCopy(int[][] board) {
		int[][] dest = new int[board.length][board.length];
		for (int j = 0; j < dest.length; j++) {
			dest[j] = board[j].clone();
		}
		return dest;
	}

	static int[][] addQueen(int[][] board, int depth, int site) {
		if (board == null) {
			return null;
		}
		if (board[depth][site] == 2) {
			return null;
		}

		for (int i = 0; i < board.length; i++) {
			board[depth][i] = 2;
			board[i][site] = 2;
		}
		board[depth][site] = 1;

		for (int i = 1; i < board.length - depth; i++) {
			if (site + i < board.length) {
				board[depth + i][site + i] = 2;
			}
			if (site - i >= 0) {
				board[depth + i][site - i] = 2;
			}
		}

		return board;
	}

	static void print(int[][] board) {
		for (int[] data : board) {
			System.out.println(Arrays.toString(data));
		}
		System.out.println();
	}
}
