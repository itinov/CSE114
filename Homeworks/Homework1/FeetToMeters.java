package Homeworks.Homework1;


// program to convert feet into meters

import java.util.Scanner;

public class FeetToMeters {

	public static void main(String[] args) {
		double feet, meters;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value in feet: ");
		feet = input.nextDouble();

		meters = feet * 0.305;
		System.out.printf("%.2f feet is %.2f meters", feet, meters);

	}
}
