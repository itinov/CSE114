package Labs.Lab3;



// Java program that sorts three integer numbers from smallest to largest

import java.util.Scanner;

public class SortThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		if (num1 > num2) { // swap num1 and num2 using a temp variable, to place num2 before num1.
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) { // swap num1 and num3...
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3) { //swap num2 and num3...
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println("The 3 integers are sorted as: " + num1 + " <= " + num2 + " <= " + num3);
	}
}
