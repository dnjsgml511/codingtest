package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1744
public class TyingUpANumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		int[] arr = new int[loop];

		for (int i = 0; i < loop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int sum = 0;
		for (int i = arr.length - 1; i >= 0; --i) {
			if (i == 0) {
				sum += arr[i];
			} else {
				if (arr[i] * arr[i - 1] > 0) {
					sum += arr[i] * arr[i-1];
					i--;
				}
			}
		}

		System.out.println(sum);

		bw.flush();
		bw.close();
	}

}
