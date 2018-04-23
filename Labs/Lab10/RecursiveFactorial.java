package Labs.Lab10;

import java.util.Scanner;

public class RecursiveFactorial {

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1); // 10 * n-1(9) * (n-1)(8)...
		// 10 * 9 * 8 ...
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to compute it's factorial: ");
		int number = input.nextInt();
		System.out.println("The factorial of " + number + " is: ");
		for(int i=number;i>0;i--) {
			System.out.print(i + " * ");
		}
		System.out.print("1");
		System.out.println(" = " + factorial(number));

	}

}
