package Labs.Lab5;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #5
 */

// program to reverse a sequence of integers and compare them to the original
// number sequence to see if the number is a palindrome

import java.util.Scanner;

public class PalindromicInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to check if it's a palindrome: ");
		int number = input.nextInt();
		
		System.out.println("The reverse of the number is: " + reverse(number));
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	}
	
	public static int reverse(int number) {  // Return the reversal of an integer, i.e., reverse(456) returns 654
		String reverse = ""; // string to hold reversed #
		String n = number + reverse; // convert num to string
		// reverse
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // parseInt used to convert string to integer
		
	}
	public static boolean isPalindrome(int number) {  // Return true if number is a palindrome
		return number == reverse(number) ? true : false; // Is the number equal to its reverse?
	}
}
