package Labs.Lab11;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter digits that you want to be summed: ");
		int numbers = input.nextInt();
		System.out.println("The sum of these numbers is: " + sumDigits(numbers));
	}

	public static int sumDigits(int n) {
		if(n < 10) { // base case: a digit sum, is that digit (0-9)
			return n;
		}
		// recursive relation
		return (n % 10) + sumDigits(n/10);
	}

}
