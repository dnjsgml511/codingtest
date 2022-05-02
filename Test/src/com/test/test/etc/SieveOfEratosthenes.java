package com.test.test.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		aratos();

	}

	private static void aratos() {

		long n = (long) Math.pow(10, 10);
//		n = 50070; // 429734
//		n = 644601; // 429734
//		n = 429734; // 429734

		long beforeTime = System.currentTimeMillis(); // 코드 실행 전에 시간 받아오기

		int[] answer = { -1, -1 };
		for (int i = 2; i < n / 2 + 1; i++) {
			for(int j = i + 1; j < n / 2 + 1; j++) {
				
			}
			if (isPrime(i) && n % i == 0 && isPrime(n / i)) {
				int small = Math.min(i, (int)(n / i));
				int big = Math.max(i, (int)(n / i));
				answer[0] = small;
				answer[1] = big;
			}
		}

		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime) / 1000; // 두 시간에 차 계산
		System.out.println("시간차이(m) : " + secDiffTime);

		System.out.println(n + " : " + Arrays.toString(answer));

	}

	private static boolean isPrime(long N) {

		if (N == 1)
			return false;
		else if (N == 2)
			return true;
		else if (N % 2 == 0)
			return false;

		int count = 0;
		for (int i = 3; i <= Math.sqrt(N); i += 2) {
			if (N % i == 0) {
				count++;
				// break를 걸거나, return false로 빠져나와도 된다.
			}
		}
		return count == 0;
	}

}
