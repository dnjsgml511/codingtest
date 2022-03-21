package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fees = { 180, 5000, 10, 600 };
		String[] records = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
				"18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };
		// 14600, 34400, 5000
		int[] sol = sol(fees, records);
		System.out.println(Arrays.toString(sol));

	}

	private static int[] sol(int[] fees, String[] records) {

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> numbers = new ArrayList<String>();

		for (String data : records) {
			String number = data.split(" ")[1];
			List<String> list = map.getOrDefault(number, new ArrayList<String>());
			list.add(data);
			map.put(number, list);
			numbers.add(number);
		}

		numbers = numbers.stream().distinct().sorted().collect(Collectors.toList());
		int[] costs = new int[numbers.size()];

		for (int i = 0; i < numbers.size(); i++) {
			String data = numbers.get(i);
			List<String> list = map.get(data);
			if (list.get(0).indexOf("IN") == -1) {
				list.add(0, "00:00 " + data + " IN");
			}
			if (list.get(list.size() - 1).indexOf("OUT") == -1) {
				list.add("23:59 " + data + " OUT");
			}

			int gapsum = 0;
			for (int j = 0; j < list.size(); j = j + 2) {
				String in = list.get(j).split(" ")[0];
				String out = list.get(j + 1).split(" ")[0];
				int gap = timeSetting(in, out);
				gapsum += gap;
			}

			gapsum = gapsum - fees[0] > 0 ? gapsum - fees[0] : 0;
			int costtime = gapsum % fees[2] == 0 ? gapsum / fees[2] : gapsum / fees[2] + 1;

			costs[i] = fees[1] + costtime * fees[3];
		}

		return costs;
	}

	private static int timeSetting(String time1, String time2) {
		String[] split1 = time1.split(":");
		String[] split2 = time2.split(":");

		int res = (Integer.parseInt(split1[0]) * 60 + Integer.parseInt(split1[1]))
				- (Integer.parseInt(split2[0]) * 60 + Integer.parseInt(split2[1]));

		return Math.abs(res);
	}

}
