package com.test.test.success.programers.level2;

import java.util.PriorityQueue;

public class MoreSpicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] scoville = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
//		int[] scoville = { 0, 0, 0, 0 };
//		int[] scoville = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int K = 7;
		int sol = sol(scoville, K);

		System.out.println();
		System.out.println(sol);
	}

	private static int sol(int[] scoville, int K) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		for (Integer data : scoville) {
			priorityQueue.add(data);
		}
		
		int cnt = 0;
		while (priorityQueue.peek() < K) {
			if(priorityQueue.size() == 1) {
				return -1;
			}
			priorityQueue.add(priorityQueue.poll() + (priorityQueue.poll() * 2));
			cnt++;
		}
		
		return cnt;
	}
}
