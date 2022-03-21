package com.test.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class ParkingFee {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		// 14600, 34400, 5000
		int[] sol = sol(fees, records);
		
	}

	private static int[] sol(int[] fees, String[] records) throws ParseException {

		HashMap<String, Integer> feeMap = new HashMap<String, Integer>();
		HashMap<String, List<String>> inout = new HashMap<String, List<String>>();
		for(String data : records) {
			String numbers = data.split(" ")[1];
			feeMap.put(numbers, 0);
		}
		
		System.out.println(feeMap);
		
		return null;
	}
	
	private static int timeSetting(String time1, String time2) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
		Date d2 = f.parse(time1), d1 = f.parse(time2);
		return (int) ((d1.getTime() - d2.getTime()) / 1000);
		
	}
}
