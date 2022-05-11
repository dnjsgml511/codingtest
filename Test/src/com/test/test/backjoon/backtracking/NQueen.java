package com.test.test.backjoon.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		sc.close();

		setPan();

		setAttackLine(2, 2);

		print();
	}

	static boolean[][] pan;
	static int size;

	static void setPan() {
		pan = new boolean[size][size];
	}

	static void checkAttackLine(int x, int y) {
		for (int i = 0; i < size; i++) {
			pan[i][y] = true;
			pan[x][i] = true;

			if (x - i >= 0 && y - i >= 0) {
				pan[x - i][y - i] = true;
			}
			if (x - i >= 0 && y + i <= size - 1) {
				pan[x - i][y + i] = true;
			}

			if (x + i <= size - 1 && y + i <= size - 1) {
				pan[x + i][y + i] = true;
			}

			if (x + i <= size - 1 && y - i >= 0) {
				pan[x + i][y - i] = true;
			}
		}
	}
	
	static void setAttackLine(int x, int y) {
		for (int i = 0; i < size; i++) {
			pan[i][y] = true;
			pan[x][i] = true;

			if (x - i >= 0 && y - i >= 0) {
				pan[x - i][y - i] = true;
			}
			if (x - i >= 0 && y + i <= size - 1) {
				pan[x - i][y + i] = true;
			}

			if (x + i <= size - 1 && y + i <= size - 1) {
				pan[x + i][y + i] = true;
			}

			if (x + i <= size - 1 && y - i >= 0) {
				pan[x + i][y - i] = true;
			}
		}
	}

	static void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(pan[i]));
		}
	}

}
