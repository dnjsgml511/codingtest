package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoteControl {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int intwant = Integer.parseInt(br.readLine());
		String[] want = Integer.toString(intwant).split("");
		int loop = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int start = 100;

		list = Arrays.stream(line).collect(Collectors.toList());

		int count = 0;
		for (int i = 0; i < want.length; i++) {
			count++;
			String target = want[i];
			int index = list.indexOf(target);
			if (index != -1) {
				count += findClose(target);
			}
		}

		if (intwant - 100 < count) {
			System.out.println(intwant - 100);
		} else {
			System.out.println(count);
		}

		bw.flush();
		bw.close();
	}

	static List<String> list;

	static int findClose(String target) {

		int tg = Integer.parseInt(target);
		int up = tg++;
		int down = tg--;
		int count = 0;
		while (true) {
			count++;
			if (list.indexOf(Integer.toString(up++)) == -1) {
				return count;
			} else if (list.indexOf(Integer.toString(down--)) == -1) {
				return count;
			}
		}
	}
}
//5457
//3
//6 7 8

//5457
//4
//6 7 8 +