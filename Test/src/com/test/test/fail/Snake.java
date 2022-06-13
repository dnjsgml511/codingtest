package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Snake {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());
		boolean[][] pan = new boolean[size][size];

		int apple = Integer.parseInt(br.readLine());
		for (int i = 0; i < apple; i++) {
			String[] split = br.readLine().split(" ");
			pan[Integer.parseInt(split[0])][Integer.parseInt(split[1])] = true;
		}

		for (boolean[] data : pan) {
			System.out.println(Arrays.toString(data));
		}

		bw.flush();
		bw.close();
	}

}

//6
//3
//3 4
//2 5
//5 3
//3
//3 D
//15 L
//17 D