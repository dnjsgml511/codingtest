package com.test.test;

public class Num124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 1;// 1
//		int n = 2;// 2
//		int n = 3;// 4
//		int n = 4;// 11
		int n = 5;// 12
//		int n = 6;// 14
//		int n = 7;// 21
//		int n = 8;// 22
//		int n = 9;// 24
//		int n = 10;// 41

		String sol = sol(n);

		System.out.println();
		System.out.println(sol);
	}

	private static String sol(int n) {
		
		String[] numbers = {"4", "1", "2"};
		String answer = "";
		
		int num = n;
		
		while(num > 0) {
			int remainder = num % 3;
			num /= 3;
			
			if(remainder == 0) num--;
			answer = numbers[remainder] + answer;
		}
		
		return answer;
	}
	

}
