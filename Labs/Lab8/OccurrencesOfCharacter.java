package Labs.Lab8;


import java.util.Scanner;

public class OccurrencesOfCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = input.next();
		System.out.println("Please enter a character: ");
		char c = input.next().charAt(0);

		System.out.println("Character " + "\'" + c + "\'" + " occurs " + count(s, c) + " time(s) in the string " + "\"" + s + "\".");

	}

	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}
}
