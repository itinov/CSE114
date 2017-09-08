package Labs.Lab5;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #5
 */
//program to display a desired pattern
//Plug in a value for the number of rows desired.

import java.util.Scanner;

public class DisplayPattern {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner
		// Prompt asking for number of rows desired
		System.out.print("Enter the number of rows: ");
		int numberOfRows = input.nextInt();
		// Display pattern
		displayPattern(numberOfRows);
	}

	/** Method to Display Pattern */
	public static void displayPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j=i; j>0;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}