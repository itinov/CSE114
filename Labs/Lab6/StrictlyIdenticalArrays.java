package Labs.Lab6;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #6
 */

import java.util.Scanner;

public class StrictlyIdenticalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter List #1 (first number is the size of array): ");
		int n = input.nextInt();
		int[] list1 = new int[n];
		for (int i = 0; i < n; i++)
			list1[i] = input.nextInt();
		System.out.print("Enter List #2 (first number is the size of array): ");
		n = input.nextInt();
		int[] list2 = new int[n];
		for (int i = 0; i < n; i++)
			list2[i] = input.nextInt();

		if (equals(list1, list2) == true) {
			System.out.println("The arrays are identical!");
		} else {
			System.out.println("The arrays are NOT identical!");
		}
	}

	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		for (int i = 0; i < list1.length; i++)
			if (list1[i] != list2[i])
				return false;
		return true;
	}
}