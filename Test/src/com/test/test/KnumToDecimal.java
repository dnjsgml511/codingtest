package com.test.test;

public class KnumToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 437674, k = 3; // 3
		int n = 110011, k = 10; // 2
		int sol = sol(n, k);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(int n, int k) {

		// String[] split = Integer.toString(n, k).split("0");	
		
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			sb.append(n % k);
			n /= k;
		}

		sb = sb.reverse();

		String[] split = sb.toString().split("0");
		
		int count = 0;
		for (String data : split) {
			if(data.equals("")) {
				count++;
				continue;
			}
			
			long intData = Long.parseLong(data);
			if (intData == 1)
				count++;
			
			for (int i = 2; i <= Math.sqrt(intData); i++) {
				if (intData % i == 0) {
					count++;
					break;
				}
			}
		}

		return split.length - count;
	}

}
