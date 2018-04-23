package Homeworks.Homework2;

// program for counting the number of times digits 0-9 appear in a String input statement.
import java.util.Scanner;

public class OccurrencesOfDigit {
	//* Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = input.nextLine();
		System.out.println("There are: ");
		
		int[] counts = count(s);
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i] + " " + i + "'s");
		}
	}
	//* Count Numbers Method */
	public static int[] count(String s) {
		int[] counts = new int[10]; // array of counts to store digits 0-9
		char[] c = s.toCharArray(); // convert string s input to a character array
		int counter = 0; // counter variable
		
		for (int i = 0; i < counts.length; i++) { // loop for 0-9
			for (int j = 0; j < c.length; j++) { // loop for string to char array

				if (Character.isDigit(c[j]) && i == Character.getNumericValue(c[j])) {
					counter++;
				}
			}
			counts[i] = counter;
			counter = 0;
		}
		return counts;
	}
}
