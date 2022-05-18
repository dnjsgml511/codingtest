package com.test.test.backjoon.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NeverHeard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int heard = sc.nextInt();
		int see = sc.nextInt();

		Set<String> set = new HashSet<>();
		for (int i = 0; i < heard; i++) {
			set.add(sc.next());
		}

		List<String> add= new ArrayList<>();
		for (int i = 0; i < see; i++) {
			String next = sc.next();
			boolean check = set.add(next);
			if(!check) {
				add.add(next);
			}
		}
		
		sc.close();
		
		System.out.println(add.size());
		Collections.sort(add);
		for(String data : add) {
			System.out.println(data);
		}
	}
}
