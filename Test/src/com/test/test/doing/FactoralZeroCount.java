package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

// https://www.acmicpc.net/problem/1676
public class FactoralZeroCount {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		if(num == 0) {
			bw.write("1");
		}else if(num <=4) {
			bw.write("0");
		}else {
			BigInteger sum = new BigInteger("1");
			for (int i = 1; i <= num; i++) {
				BigInteger index = new BigInteger(Integer.toString(i));
				sum = sum.multiply(index);
			}

			System.out.println(sum);
			
			BigInteger ten = new BigInteger("10");
			BigInteger zero = new BigInteger("0");

			while (true) {
				if (!sum.remainder(ten).equals(zero)) {
					sum = sum.divide(ten);
				} else {
					break;
				}
			}

			int count = 0;
			while (true) {
				if (sum.remainder(ten).equals(zero)) {
					count++;
					sum = sum.divide(ten);
				} else {
					break;
				}
			}
			
			bw.write(Integer.toString(count));
		}

		bw.flush();
		bw.close();
	}
}
