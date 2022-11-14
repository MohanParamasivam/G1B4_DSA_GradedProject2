package com.gl.GCA2.DSA.SkyScraper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("enter the total no of floors in the building");

			int noOfFloor = sc.nextInt();
			int[] floors = new int[noOfFloor];

			for (int i = 0; i < noOfFloor; i++) {
				System.out.println("enter the floor size given on day : " + (i + 1));
				floors[i] = sc.nextInt();
			}

			System.out.println();

			// Object creation for class Floor
			Floor floor = new Floor();
			floor.assembly(floors, noOfFloor);
			sc.close();

		}
	}

}
