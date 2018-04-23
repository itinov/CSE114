package Labs.Lab11;


import java.util.Scanner;

public class ReverseDisplay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string to reverse: ");
		String str = input.nextLine();
		System.out.println("\nReversed String: ");
		reverseDisplay(str);

	}
	// helper method
	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length()-1);
	}
	
	public static void reverseDisplay(String value, int pos) {
		if(pos == -1) {
			return;
		}
		// reverse relation
		System.out.print(value.charAt(pos));
		reverseDisplay(value, pos-1);
	}

}
