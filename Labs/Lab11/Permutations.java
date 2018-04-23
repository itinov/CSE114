package Labs.Lab11;


import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string to display it's permutations recursively: ");
		String str = input.nextLine();
		
		System.out.println("\n-----Permutations-----");
		displayPermutations(str);
	}
	// helper method
	public static void displayPermutations(String s) {
		displayPermutations("", s);
	}
	public static void displayPermutations(String s1, String s2) {
		// base case
		if(s2.equals("")) { 
			System.out.println(s1);
		}
		// recursive relation
		for(int i=0;i<s2.length();i++) {
			char c = s2.charAt(i);
			String newS1 = s1 + c;
			String newS2 = s2.substring(0,  i) + s2.substring(i+1);
			displayPermutations(newS1, newS2);
		}
	}
}
