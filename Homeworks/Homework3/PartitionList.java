package Homeworks.Homework3;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 3
 */

/* Program that inserts a integer value (pivot) into a list and moves all the
 * values less than the pivot to the left, creating a partition of the original list
 */

import java.util.Scanner;

public class PartitionList {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the list (first number is the pivot, then the list): ");
		String s = input.nextLine();
		String[] elements = s.split(" ");
		int[] a = new int[elements.length];
		for (int i = 0; i < elements.length; i++)
			a[i] = Integer.parseInt(elements[i]);

		int p = partition(a);
		System.out.print("After the partition, the list is: ");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println("\nPosition of pivot " + a[p] + " is " + p);
	}
	/** Partition Method */
	public static int partition(int[] list) {
		int pivot = list[0];
		int[] newList = new int[list.length];
		int low = 0;
		int high = list.length - 1;
		for (int i = 1; i < list.length; i++)
			if (pivot > list[i])
				newList[low++] = list[i];
			else
				newList[high--] = list[i];
		newList[low] = pivot;
		for (int i = 0; i < list.length; i++)
			list[i] = newList[i];
		return low;
	}

}  
