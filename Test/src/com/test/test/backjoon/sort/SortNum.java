package com.test.test.backjoon.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortNum {

	static List<Integer> list;
	static int[] tmp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();
		list = new ArrayList<>();
		for (int i = 0; i < loop; i++)
			list.add(sc.nextInt());

		sc.close();

		mergeSort();

		for (Integer data : list) {
			System.out.println(data);
		}
	}

	static void mergeSort() {
		tmp = new int[list.size()];
		mergeSort(0, list.size() - 1);
	}

	static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int p = start;
			int q = mid + 1;
			int idx = p;

			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && list.get(p) < list.get(q))) {
					tmp[idx++] = list.get(p++);
				} else {
					tmp[idx++] = list.get(q++);
				}
			}

			for (int i = start; i <= end; i++) {
				list.set(i, tmp[i]);
			}
		}
	}

	static void quickSort(List<Integer> list) {
		quickSort(list, 0, list.size() - 1);
	}

	static void quickSort(List<Integer> list, int start, int end) {
		if (start >= end)
			return;

		int pivot = start, i = start + 1, j = end, temp;

		while (i <= j) {
			while (i <= end && list.get(i) < list.get(pivot))
				i++;

			while (j > start && list.get(j) >= list.get(pivot))
				j--;

			if (i > j) {
				temp = list.get(j);
				list.set(j, list.get(pivot));
				list.set(pivot, temp);
			} else {
				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}

		quickSort(list, start, j - 1);
		quickSort(list, j + 1, end);
	}

}
