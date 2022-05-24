package com.test.test.success.backjoon.sliver.three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FashionKing {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int loop = Integer.parseInt(br.readLine());
		for (int i = 0; i < loop; i++) {
			int size = Integer.parseInt(br.readLine());
			HashMap<String, List<String>> map = new HashMap<>();
			for (int j = 0; j < size; j++) {
				String[] line = br.readLine().split(" ");
				List<String> target = map.getOrDefault(line[1], new ArrayList<>());
				target.add(line[0]);
				map.put(line[1], target);
			}

			int sum = 1;
			for (Entry<String, List<String>> data : map.entrySet()) {
				sum *= data.getValue().size() + 1;
			}

			sum--;
			bw.write(Integer.toString(sum));
			bw.write("\n");

		}

		bw.flush();
		bw.close();
	}
}

//3
//hat headgear
//sunglasses eyewear
//turban headgear