package Labs.Lab8;


import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String s = input.nextLine();
		System.out.println("There are " + countLetters(s) + " letters in this string.");

	}

	public static int countLetters(String s) {
		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(c[i])) {
				count++;
			}
		}
		return count;
	}
}
