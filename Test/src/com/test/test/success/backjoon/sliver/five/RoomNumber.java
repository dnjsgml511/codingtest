package com.test.test.success.backjoon.sliver.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;

public class RoomNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String, Integer> map = new HashMap<>();
		for (String data : br.readLine().replaceAll("9", "6").split("")) {
			map.put(data, map.getOrDefault(data, 0) + 1);
		}

		int max = 0;
		for (Entry<String, Integer> data : map.entrySet()) {
			int value = data.getValue();
			if (data.getKey().equals("6"))
				value = value % 2 == 0 ? value / 2 : value / 2 + 1;
			max = Math.max(max, value);
		}

		bw.write(Integer.toString(max));

		bw.flush();
		bw.close();
	}

}
