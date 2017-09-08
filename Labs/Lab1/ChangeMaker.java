package Labs.Lab1;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 */

// ChangeMaker program that gives change in quarters, dimes, nickels, and pennies.
// *** updated *** to add a limit to using up to 99 cents through if... else statement

import java.util.Scanner;

public class ChangeMaker {
	public static void main(String[] args) {
		int change, remainder, quarters, dimes, nickels, pennies;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the change amount in cents(1-99): ");
		change = input.nextInt();
		
		if (change >= 1 && change < 100) {
			quarters = change / 25;
			remainder = change % 25;
			dimes = remainder / 10;
			remainder = remainder % 10;
			nickels = remainder / 5;
			remainder = remainder % 5;
			pennies = remainder;
			
			System.out.print("Your change is: ");
			System.out.print(quarters + " quarters, " + dimes + " dimes, ");
			System.out.print(nickels + " nickels and, " + pennies + " pennies");
		}
		else {
			System.out.println("Maxiumum number of cents is limited to 99.");
		}
	}
}
