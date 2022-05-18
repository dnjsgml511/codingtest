package com.test.test.backjoon.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			char[] functions = sc.next().toCharArray();
			String[] arr = new String[sc.nextInt()];
			String line = sc.next();
			line = line.substring(1, line.length() - 1);
			String[] split = line.split(",");
			for (int j = 0; j < split.length; j++) {
				if (!split[j].equals("")) {
					arr[j] = split[j];
				}
			}

			int start = 0, end = arr.length, len = end - start;
			boolean flag = true, show = true;
			for (char data : functions) {
				if (data == 'R')
					flag = !flag;
				else {
					len--;
					if (len < 0) {
						len++;
						System.out.println("error");
						show = false;
					}

					if (flag) {
						start++;
					} else {
						end--;
					}
				}
			}

			if (!show) {
				continue;
			}

			List<String> list = new ArrayList<>();
			if (flag) {
				for (int j = start; j < end; j++)
					list.add(arr[j]);
			} else {
				for (int j = end - 1; j >= start; --j)
					list.add(arr[j]);
			}

			System.out.println(list.toString().replaceAll(" ", ""));
		}

		sc.close();
	}
}
