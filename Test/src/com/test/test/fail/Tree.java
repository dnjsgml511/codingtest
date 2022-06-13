package com.test.test.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tree {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int node = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int remove = Integer.parseInt(br.readLine());

		int[] addnode = new int[node];
		for (int i = 0; i < node; i++) {
			addnode[i] = Integer.parseInt(line[i]);
		}

		bw.flush();
		bw.close();
	}

	private class Node {
		private int data;
		private Node next;

		public Node(int input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}

}
