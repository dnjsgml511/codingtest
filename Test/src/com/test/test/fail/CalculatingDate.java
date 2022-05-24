package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CalculatingDate {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]); // 15
		int b = Integer.parseInt(line[1]); // 28
		int c = Integer.parseInt(line[2]); // 19

		int answer = 0;
		for (; answer < 15 * 28 * 19; answer++) {
			if (answer % 15 == a && answer % 28 == b && answer % 19 == c) {
				break;
			}
		}

		bw.write(Integer.toString(answer));

		bw.flush();
		bw.close();
	}

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

}

// 15 28 19