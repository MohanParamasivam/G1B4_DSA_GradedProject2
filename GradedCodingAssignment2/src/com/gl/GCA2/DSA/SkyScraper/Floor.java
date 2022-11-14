package com.gl.GCA2.DSA.SkyScraper;

import java.util.PriorityQueue;

public class Floor {

	public void assembly(int floor[], int noOfFloors) {
		System.out.println("The order of construction is as follows");

		// Collections. reverseOrder() is used to sort the Priority Queue in reverse order
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempfloor = new int[noOfFloors];
		int max = noOfFloors;
		System.out.println();

		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Day:" + (i + 1));
			tempfloor[i] = floor[i];

			// add is used to insert items into Priority Queue
			queue.add(tempfloor[i]);

			// peek is used to print the topmost element of Priority Queue
			while (!queue.isEmpty() && queue.peek() == max) {

				// poll is used to take the max element out of the queue
				System.out.print(queue.poll() + " ");
				max--;
			}
			System.out.println();
		}

	}
}