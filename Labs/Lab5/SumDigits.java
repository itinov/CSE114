package Labs.Lab5;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #5
 */

// program to sum the digits in a sequence of numbers

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type digits here: ");	
		long num = input.nextLong();
		System.out.println("Sum of digits in " + "'" + num + "'" +  " is " + sumDigits(num));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum = (int)(sum + n % 10); // take away right-most digit for adding to total sum
			n = n / 10; // take away right-most digit so that the left-over digits can be separated and extracted to be added to total sum above
		}	
		return sum;
	}
}
