package com.test.test.success.backjoon.sliver.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// https://www.acmicpc.net/problem/10825
public class KoreanEnglishMath {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		List<String[]> list = new ArrayList<>();
		for (int i = 0; i < loop; i++)
			list.add(br.readLine().split(" "));

		Collections.sort(list, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {

				String name1 = o1[0];
				String name2 = o2[0];

				int korean1 = Integer.parseInt(o1[1]);
				int korean2 = Integer.parseInt(o2[1]);

				int english1 = Integer.parseInt(o1[2]);
				int english2 = Integer.parseInt(o2[2]);

				int math1 = Integer.parseInt(o1[3]);
				int math2 = Integer.parseInt(o2[3]);

				if (korean1 != korean2) {
					return korean2 - korean1;
				} else if (english1 != english2) {
					return english1 - english2;
				} else if (math1 != math2) {
					return math2 - math1;
				} else {
					return name1.compareTo(name2);
				}
			}
		});

		for (String[] data : list) {
			bw.write(data[0]);
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}

//12
//Junkyu 50 60 100
//Sangkeun 80 60 50
//Sunyoung 80 70 100
//Soong 50 60 90
//Haebin 50 60 100
//Kangsoo 60 80 100
//Donghyuk 80 60 100
//Sei 70 70 70
//Wonseob 70 70 90
//Sanghyun 70 70 80
//nsj 80 80 80
//Taewhan 50 60 90
