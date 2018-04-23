package Labs.Lab10;


import java.util.Scanner;

public class RecursiveUppercaseLetters {
	
	public static int upperCases(String s) {
		return upperCases(s, 0);
	}
	public static int upperCases(String s, int high) {
		if(high==s.length())
			return 0;
		return upperCases(s, high+1) 
				+ (Character.isUpperCase(s.charAt(high)) ? 1 : 0);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string to count the number of uppercase characters: ");
		String str = input.nextLine();
		System.out.println("There are " + upperCases(str) + " uppercase letters in " + str);

	}

}
