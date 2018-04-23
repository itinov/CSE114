package Homeworks.Homework5;


import java.util.Scanner;

public class SumSquares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Recursive program for summing the squares of two numbers...");
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = input.nextInt();
		System.out.println(sumSquares(number1, number2));
	}

	public static int sumSquares(int i, int n) {
		if (i <= n)
			return i * i + sumSquares(i + 1, n);
		else
			return 0;
	}
}
