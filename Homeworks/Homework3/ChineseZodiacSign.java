package Homeworks.Homework3;


// Program to discover your chinese zodiac symbol by inputting your birth year
import java.util.Scanner;

public class ChineseZodiacSign {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year: ");
		int year = input.nextInt();
		String[] zodiacSign = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };
		System.out.print("Your sign is the year of the: " + zodiacSign[year % 12]);
	}

}
