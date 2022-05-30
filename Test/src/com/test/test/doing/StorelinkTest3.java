package com.test.test.doing;

public class StorelinkTest3 {

	public static void main(String[] args) {

//		for(int i = 1000; i < 10000; i++) {
//			int n = 50000000;
		String s = "abcdcbaabcdcbaabcdcbaabcdcba";

		int sol = sol(s);

		System.out.println();
		System.out.println(sol);
//			System.out.println(i + " = " + sol);
//		}

//		System.out.println(Arrays.toString(sol));
	}

	private static int sol(String s) {

		int max = 0;
		for (int i = 1; i < s.length(); i++) {
			int left = i - 1, right = i + 1;
			while (left >= 0 && right <= s.length() - 1) {
				String cut = s.substring(left, right + 1);
				StringBuilder sb= new StringBuilder(cut);
				sb.reverse();
				
				if(sb.toString().equals(cut)) {
					max = Math.max(max, cut.length());
				}
				
				left--;
				right++;
			}
		}

		return max;
	}
}
