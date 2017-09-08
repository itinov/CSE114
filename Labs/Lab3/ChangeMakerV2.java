package Labs.Lab3;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #3
 */

// Revised ChangeMaker program from Lab 1, that incorporates dollar bills up to $20.

import java.util.Scanner;

public class ChangeMakerV2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the price: $");
			double price = input.nextDouble();
		System.out.print("Please enter the amount given: $");
			double amount = input.nextDouble();
		
		double change = amount - price; 	    // finding the change from the amount given and price of item
		int remainder = (int) (change * 100);   // ex: 12.50 * 1000 = 1250
		
		// bills: $20, $10, $5, $1
		int twenties = remainder / 2000;
		remainder = remainder % 2000;
		int tens = remainder / 1000;
		remainder = remainder % 1000;
		int fives = remainder / 500;
		remainder = remainder % 500;
		int ones = remainder / 100;
		remainder = remainder % 100;
		
		// coins: 25c, 10c, 5c, 1c
		int quarters = remainder / 25;
		remainder = remainder % 25;
		int dimes = remainder / 10;
		remainder = remainder % 10;
		int nickels = remainder / 5;
		remainder = remainder % 5;
		int pennies = remainder;
		
		// print change
		System.out.printf("The change is: $%.2f\n", change);
		System.out.println();
		
		// use if-statements to remove unnecessary "0" printing of bills/coins (DO NOT PRINT IF = 0)
		if (twenties != 0) {
			System.out.println(twenties + " x $20 bills");
		}
		if (tens != 0) {
			System.out.println(tens + " x $10 bills");
		}
		if (fives != 0) {
			System.out.println(fives + " x $5 bills");
		}
		if (ones != 0) {
			System.out.println(ones + " x $1 bills");
		}
		if (quarters != 0) {
			System.out.println(quarters + " x 25 cents");
		}
		if (dimes != 0) {
			System.out.println(dimes + " x 10 cents");
		}
		if (nickels != 0) {
			System.out.println(nickels + " x 5 cents");
		}
		if (pennies != 0) {
			System.out.println(pennies + " x 1 cent");
		}		
		input.close(); // close scanner
	}
}
