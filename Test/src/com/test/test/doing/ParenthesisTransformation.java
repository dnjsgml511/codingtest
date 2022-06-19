package com.test.test.doing;

import java.io.IOException;

public class ParenthesisTransformation {

	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {

		String[] p = { "(()())()", ")(", "()))((()" };

		String[] result = { "(()())()", "()", "()(())()" };

		for (int i = 0; i < p.length; i++) {
			String sol = sol(p[i]);

			if (!sol.equals(result[i])) {
				System.out.println("Fail");
				return;
			}
		}
		System.out.println("Success");

	}

	static String sol(String p) throws IOException {

		System.out.println(p);
		int cut = cut(p);
		String u = p.substring(0, cut);
		String v = p.substring(cut);
		
		uFunction(u);

		return "";
	}

	static String uFunction(String u) {
		
		if(u.charAt(0) == '(') {
			return u;
		}
		
		StringBuilder tmp = new StringBuilder();
		tmp.append("(");
		tmp.append(u);
		
		
		return "";
	}

	static int cut(String p) {

		int depth = 0;
		char start = p.charAt(0);
		for (int i = 0; i < p.length(); i++) {
			char tmp = p.charAt(i);
			if (tmp == start) {
				depth++;
			} else {
				depth--;
			}

			if (depth == 0) {
				return i + 1;
			}
		}

		return 0;
	}

}
