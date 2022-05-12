package com.test.test.backjoon.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) {
		System.out.println("start!");
		Runtime.getRuntime().gc();
		long beforeTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < num; i++) {
			int[][] newpan = addQueen(new int[num][num], 0, i);
			backtracking(newpan, 1);
		}

		System.out.println(answer);
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.print(usedMemory + " bytes");
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
	
	static int[][] deepCopy(int[][] board){
		int[][] dest = new int[board.length][board.length];
		for(int j = 0; j < dest.length; j++) {
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
		for(int[] data : board) {
			System.out.println(Arrays.toString(data));
		}
		System.out.println();
	}
}
