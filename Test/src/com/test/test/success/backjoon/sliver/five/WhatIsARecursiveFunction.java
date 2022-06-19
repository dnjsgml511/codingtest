package com.test.test.success.backjoon.sliver.five;

// https://www.acmicpc.net/problem/17478
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WhatIsARecursiveFunction {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		count = Integer.parseInt(br.readLine());

		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		bw.write("\n");
		
		recursiveFunction(0);

		bw.flush();
		bw.close();
	}

	static void recursiveFunction(int loop) throws Exception {

		StringBuilder underbar = new StringBuilder();
		for(int i = 0; i < loop; i++) {
			underbar.append("____");
		}
		
		if (loop == count) {
			bw.write(underbar.toString());
			bw.write("\"����Լ��� ������?\"");
			bw.write("\n");
			
			bw.write(underbar.toString());
			bw.write("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			bw.write("\n");
			
			bw.write(underbar.toString());
			bw.write("��� �亯�Ͽ���.");
			bw.write("\n");
			return;
		}

		bw.write(underbar.toString());
		bw.write("\"����Լ��� ������?\"");
		bw.write("\n");

		bw.write(underbar.toString());
		bw.write("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		bw.write("\n");

		bw.write(underbar.toString());
		bw.write("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		bw.write("\n");

		bw.write(underbar.toString());
		bw.write("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		bw.write("\n");

		recursiveFunction(loop + 1);

		bw.write(underbar.toString());
		bw.write("��� �亯�Ͽ���.");
		bw.write("\n");
	}

}
