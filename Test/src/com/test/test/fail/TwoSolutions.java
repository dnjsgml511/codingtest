package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class TwoSolutions {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		String[] line = br.readLine().split(" ");
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(line[i]);
		}

		Arrays.sort(arr);

		int frontindex = 0, backindex = count - 1;
		int front = 0, back = 0;
		int min = Integer.MAX_VALUE;
		while (frontindex < backindex) {
			
			int sum = arr[frontindex] + arr[backindex];
			int tmp = Math.abs(sum);

			if (min > tmp) {
				min = tmp;
				front = arr[frontindex];
				back = arr[backindex];
			}
			
			if(tmp > 0) {
				backindex--;
			}else {
				frontindex++;
			}
		}

		bw.write(Integer.toString(front));
		bw.write(" ");
		bw.write(Integer.toString(back));

		bw.flush();
		bw.close();
	}
}
