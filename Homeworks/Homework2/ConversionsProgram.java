package Homeworks.Homework2;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Homework 2
 */
// program for various conversions between pounds to kilos, miles to kilometers and vice versa for the two options.

import java.util.Scanner;

public class ConversionsProgram {
	//* Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose from one of the following options: ");
		System.out.println("A – convert pounds to kilos");
		System.out.println("B – convert kilos to pounds");
		System.out.println("C – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers");
		System.out.println("E - Exit");
		
		char choice;
		choice = input.next().charAt(0); // .charAt(0) to read A,B,C,D,E b/c choices are at the 0 index position
		// switch statement for the various choices from A-E
		switch(choice) {
		case 'A':
			poundsToKilos(0);
			break;
		case 'B':
			kilosToPounds(0);
			break;
		case 'C':
			kmToM(0);
			break;
		case 'D':
			MToKm(0);
			break;
		case 'E':
			break;
		default:
			System.out.println("Invalid option entered.");
		}
	}
// methods for each conversion
	public static double poundsToKilos(double pounds){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value in pounds: ");
		pounds = input.nextDouble();
		
		double kilos = pounds / 2.20462;
			System.out.println(kilos + " kg is " + pounds + " lbs");
				return 0;
	}
	
	public static double kilosToPounds (double kilos){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value in kilograms: ");
		kilos = input.nextDouble();
		
		double pounds = kilos * 2.20462;
			System.out.println(pounds + " lb is " + kilos + " kgs");
				return 0;
	}
	
	public static double kmToM(double kms){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value in kilometers: ");
		kms = input.nextDouble();
		
		double miles = kms / 1.60934;
			System.out.println(miles + " miles is " + kms + " kilometers");
				return 0;
	}
	
	public static double MToKm(double m){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a value in miles: ");
		m = input.nextDouble();
		
		double kms = m * 1.60934;
			System.out.println(kms + " kilometers is " + m + " miles");
			return 0;
	}
	
}
