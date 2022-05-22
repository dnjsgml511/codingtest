package com.test.test.success.backjoon.sliver.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SearchDocument {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String document = br.readLine();
		String search = br.readLine();

		String tmp = document.replaceAll(search, "");

		int documentlen = document.length();
		int searchlen = search.length();
		int tmplen = tmp.length();
		int etc = documentlen - tmplen;
		int answer = etc / searchlen;

		bw.write(Integer.toString(answer));
		bw.flush();
		bw.close();
	}
}
