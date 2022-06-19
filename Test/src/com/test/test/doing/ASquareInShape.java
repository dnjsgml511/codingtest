package com.test.test.doing;

import java.io.IOException;
import java.math.BigInteger;

public class ASquareInShape {

	public static void main(String[] args) throws Exception {

		int h = 8;
		int w = 12;
		long result = 80;

		long sol = sol(w, h);
		if (sol == result) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

	}

	static long sol(int w, int h) throws IOException {

		int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
		System.out.println(gcd);
		
		return 0;
	}

}
