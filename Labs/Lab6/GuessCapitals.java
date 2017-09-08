package Labs.Lab6;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #6
 */

import java.util.Scanner;

public class GuessCapitals {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double numCorrect = 0;
		for (int i = 0; i < stateCapitals.length; i++) {
			System.out.print("What is the capital of " + stateCapitals[i][0] + "? ");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(stateCapitals[i][1])) {
				System.out.println("Your answer is correct!");
				numCorrect++;
			} else {
				System.out.println("WRONG - The correct answer is " + stateCapitals[i][1]);
			}
		}
		System.out.println();
		System.out.printf("You guessed %.0f state capitals out of 50. That is %.0f percent.", numCorrect, ((numCorrect/50)* 100));
	}

	private static String[][] stateCapitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" },
			{ "Arizona", "Phoenix" }, { "Arkansas", "Little Rock" }, { "California", "Sacramento" },
			{ "Colorado", "Denver" }, { "Connecticut", "Hartford" }, { "Delaware", "Dover" },
			{ "Florida", "Tallahassee" }, { "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" },
			{ "Illinois", "Springfield" }, { "Maryland", "Annapolis" }, { "Minnesota", "Saint Paul" },
			{ "Iowa", "Des Moines" }, { "Maine", "Augusta" }, { "Kentucky", "Frankfort" },
			{ "Indiana", "Indianapolis" }, { "Kansas", "Topeka" }, { "Louisiana", "Baton Rouge" },
			{ "Oregon", "Salem" }, { "Oklahoma", "Oklahoma City" }, { "Ohio", "Columbus" },
			{ "North Dakota", "Bismark" }, { "New York", "Albany" }, { "New Mexico", "Santa Fe" },
			{ "New Jersey", "Trenton" }, { "New Hampshire", "Concord" }, { "Nevada", "Carson City" },
			{ "Nebraska", "Lincoln" }, { "Montana", "Helena" }, { "North Carolina", "Raleigh" },
			{ "Missouri", "Jefferson City" }, { "Mississippi", "Jackson" }, { "Massachusetts", "Boston" },
			{ "Michigan", "Lansing" }, { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" },
			{ "South Carolina", "Columbia" }, { "South Dakota", "Pierre" }, { "Tennessee", "Nashville" },
			{ "Texas", "Austin" }, { "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" },
			{ "Virginia", "Richmond" }, { "Washington", "Olympia" }, { "West Virginia", "Charleston" },
			{ "Wisconsin", "Madison" }, { "Wyoming", "Cheyenne" } };
}