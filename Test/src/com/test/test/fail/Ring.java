package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/3036
public class Ring {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] arr = new int[loop];
		int start = Integer.parseInt(line[0]);
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(line[i]);
			System.out.println(gcd(start, num));
		}

		bw.flush();
		bw.close();
	}

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(a % b, b);
	}

}

//3
//8 4 2

//2/1
//4/1