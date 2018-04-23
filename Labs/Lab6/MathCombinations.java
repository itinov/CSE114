package Labs.Lab6;


import java.util.Scanner;

public class MathCombinations {
	public static void main(String[] args) {

		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
			for (int i = 0; i < 10; i++)
				numbers[i] = input.nextInt();
		
		System.out.println();
		System.out.println("The combinations for these 10 numbers are: ");
		
		for (int i = 0; i < numbers.length; i++) {
			for (int k = 0; k < numbers.length; k++) {
				if (k != i) {
					System.out.print(numbers[i] + "-" + numbers[k] + " ");
				}
			}
			System.out.println("");
		}
	}
}
