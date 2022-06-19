package com.test.test.doing;

import java.util.HashSet;

public class LengthOfVisit {

	public static void main(String[] args) {

		String[] dirs = { "ULURRDLLU", "LULLLLLLU" };
		int[] answer = { 7, 7 };

		for (int i = 0; i < dirs.length; i++) {
			int sol = solution(dirs[i]);
			if (sol != answer[i]) {
				System.out.println("Fail");
				return;
			}
			System.out.println("-----------------");
		}
		System.out.println("Success");
	}

	static int solution(String dirs) {
		HashSet<String> set = new HashSet<>();

		int x = 0, y = 0;
		for (int i = 0; i < dirs.length(); i++) {
			char tmp = dirs.charAt(i);

			StringBuilder sbA = new StringBuilder();
			StringBuilder sbB = new StringBuilder();
			sbA.append(x).append(y);
			sbB.append(x).append(y);

			switch (tmp) {
			case 'L':
				x--;
				if (x == -6) {
					x++;
					continue;
				}
				break;
			case 'R':
				x++;
				if (x == 6) {
					x--;
					continue;
				}
				break;
			case 'U':
				y++;
				if (y == 6) {
					y--;
					continue;
				}
				break;
			case 'D':
				y--;
				if (y == -6) {
					y++;
					continue;
				}
				break;

			default:
				break;
			}

			sbA.append(x).append(y);
			sbB.insert(0, y).insert(0, x);

			set.add(sbA.toString());
			set.add(sbB.toString());
		}

		return set.size() / 2;
	}

}
