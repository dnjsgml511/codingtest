package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordMath {

	static String[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());

		HashMap<Character, Integer> map = new HashMap<>();
		arr = new String[loop];
		int maxlen = 0;
		for (int i = 0; i < loop; i++) {
			String line = br.readLine();
			arr[i] = line;
			maxlen = Math.max(maxlen, line.length());
		}

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			for (String data : arr[i].split("")) {
				list.add(data);
			}
		}

		List<String> alpabat = list.stream().distinct().sorted().collect(Collectors.toList());

		reculsion(alpabat, new ArrayList<String>(), alpabat.size(), alpabat.size());
		
//		int start = 9;
//		for (int i = maxlen; i >= 1; --i) {
//			for (int j = 0; j < loop; j++) {
//				if (arr[j].length() == i) {
//					Integer tmp = map.get(arr[j].charAt(0));
//					if(tmp == null) {
//						map.put(arr[j].charAt(0), start--);
//					}
//					arr[j] = arr[j].substring(1);
//				}
//			}
//		}
//
//		int sum = 0;
//		for (int i = 0; i < def.length; i++) {
//			String[] tmp = def[i].split("");
//			StringBuilder sb = new StringBuilder();
//			for (String data : tmp) {
//				sb.append(map.get(data.charAt(0)));
//			}
//			sum += Integer.parseInt(sb.toString());
//		}
//
//		bw.write(Integer.toString(sum));

		bw.flush();
		bw.close();
	}

	static void reculsion(List<String> list, List<String> result, int n, int r) {
		if (r == 0) {
			for(int i = 0, num = 9; i < result.size(); i++, num--) {
				
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			result.add(list.remove(i));
			reculsion(list, result, n - 1, r - 1);
			list.add(i, result.remove(result.size() - 1));
		}
	}
}
