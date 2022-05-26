package com.test.test.success.backjoon.bronze.five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2558
public class AB2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(Integer.toString(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine())));
		
		bw.flush();
		bw.close();
	}

}
