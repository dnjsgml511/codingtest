package com.test.test.success.backjoon.sliver.four.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Card2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		Deque<Integer> cards = new LinkedList<Integer>();
		for(int i = 1; i <= num; i++) {
			cards.offerLast(i);
		}
		
		while(cards.size() != 1) {
			cards.pollFirst();
			cards.offerLast(cards.pollFirst());
		}
		
		bw.write(Integer.toString(cards.pop()));
		
		bw.flush();
		bw.close();
	}
}
