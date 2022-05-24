package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TiledOrnament {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long num = Long.parseLong(br.readLine());

		if (num == 1) {
			bw.write(Long.toString(4));
		} else if (num == 2) {
			bw.write(Long.toString(6));
		} else {

			long a = 1, b = 1;
			for (int i = 2; i < num; i++) {
				long tmp = a;
				a = b;
				b = tmp + b;
			}

			bw.write(Long.toString(b * 4 + a * 2));

		}

		bw.flush();
		bw.close();
	}
}
