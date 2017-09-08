package Homeworks.Homework5;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 5
 */

import java.util.Scanner;

public class AddWithoutPlus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Recursive program for adding 2 numbers...");
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + add(number1, number2));
	}

	public static int add(int x, int y) {
		return add(0, y, x);
	}
	
	public static int add(int i, int y, int result) {
		if (i < y)
			return add(++i, y, ++result);
		return result;
	}
}
