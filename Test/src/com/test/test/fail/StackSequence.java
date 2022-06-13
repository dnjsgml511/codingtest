package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// https://www.acmicpc.net/problem/1874
public class StackSequence {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		List<Integer> sort = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < loop; i++) {
			int num = Integer.parseInt(br.readLine());
			sort.add(num);
			list.add(0, num);
		}

		Collections.sort(sort, Collections.reverseOrder());


		System.out.println(sort);
		System.out.println();
		
		bw.flush();
		bw.close();

	}
}

//8
//4
//3
//6
//8
//7
//5
//2
//1