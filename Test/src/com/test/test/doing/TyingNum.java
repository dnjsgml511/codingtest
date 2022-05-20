package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TyingNum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		int sum = 0;

		while (list.size() != 0) {

			int target = list.remove(0);
			if (target == 1 || target == 0 || list.size() == 0) {
				sum += target;
				continue;
			}

			if (target * list.get(0) > 0) {
				sum += (target * list.remove(0));
			} else {
				sum += target;
			}
		}

		bw.write(Integer.toString(sum));

		bw.flush();
		bw.close();
	}

}
