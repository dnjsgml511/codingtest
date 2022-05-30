package com.test.test.doing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StorelinkTest1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		for (int i = 1; i < 50000000; i++) {
//			int n = 50000000;
			int n = 11;
//			int n = i;

			int sol = sol(n);

//			bw.write(i + " = " + sol);
			bw.write(Integer.toString(sol));
			bw.write("\n");
//		}

		bw.flush();
		bw.close();

//		System.out.println(Arrays.toString(sol));
	}

	private static int sol(int num) {

		while (num <= 50000000) {
			String str = Integer.toString(num);
			if (str.length() % 2 == 0) {
				String front = str.substring(0, str.length() / 2);
				String back = str.substring(str.length() / 2);
				
				System.out.println(front + " / " + back);
				
				int frontnum = 1, backnum = 1;
				for (int data : front.toCharArray())
					frontnum *= (data - '0');
				for (int data : back.toCharArray())
					backnum *= (data - '0');
				if (frontnum == backnum)
					return num;
				num++;
			} else {
				num = (int) Math.pow(10, str.length());
			}

		}

		return 50000000;
	}
}
