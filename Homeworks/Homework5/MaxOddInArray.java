package Homeworks.Homework5;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 5
 */

public class MaxOddInArray {

	public static void main(String[] args) {
		System.out.println("This program computes the maximum value in a list...");
		int[] list = { 6, 7, 10, 9, 2, 3, 5, 11, 1, 0 };
		int maxOdd = maxOdd(list);
		System.out.println("The maximum value in this list is: " + maxOdd);
	}

	public static int maxOdd(int[] list) {
		return maxOdd(list, 0);
	}

	public static int maxOdd(int[] list, int high) {
		if (high == list.length)
			return 1;
		int maxRest = maxOdd(list, high + 1);
		if (list[high] % 2 == 1 && maxRest < list[high])
			return list[high];
		else
			return maxRest;
	}
}
