package com.test.test.doing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
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

		for (String[] strings : list) {
			
		}
		
		bw.flush();
		bw.close();
	}

}
