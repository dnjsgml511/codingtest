package com.test.test.success.programers.level1;

public class NumChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String num = "7zero8sevensix567";
		String num = "1zero5six560seven";
		String sol = sol(num);
		
		System.out.println();
		System.out.println(sol);
	}
	
	private static String sol(String num) {
		
		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		for (int i = 0; i <strArr.length; i++) 
			num = num.replaceAll(strArr[i], numArr[i]);
		
		return num;
	}

}
